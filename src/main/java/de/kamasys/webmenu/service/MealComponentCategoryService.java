package de.kamasys.webmenu.service;

import de.kamasys.webmenu.json.Speisen;
import de.kamasys.webmenu.model.MealComponentCategory;
import de.kamasys.webmenu.repository.MealComponentCategoryRepository;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MealComponentCategoryService extends AbstractService<MealComponentCategory, Long> {
    // configure logger instance
    private static final Logger log = LoggerFactory.getLogger(MealComponentCategoryService.class);

    @Autowired
    private MealComponentCategoryRepository mealComponentCategoryRepository;

    /* -------------------------------------------------------- */


    /**
     * Adds a new meal component category.
     *
     * @param name
     * @return
     */
    public MealComponentCategory add(String name) {
        return (MealComponentCategory) mealComponentCategoryRepository.save(new MealComponentCategory(name));
    }


    /**
     * Returns or creates the given component category from Json object.
     *
     * @param speisen Source class instance.
     * @return Category instance.
     */
    public MealComponentCategory getOrCreate(Speisen speisen) {
        var name = speisen.getKomponentenGruppenBezeichnung().trim();
        log.debug("get/create meal component category by name: {}", name);

        var entityOpt = mealComponentCategoryRepository.findByName(name);
        return (MealComponentCategory) entityOpt.orElse(add(name));
    }


    @Override
    protected JpaRepository<MealComponentCategory, Long> getRepository() {
        return mealComponentCategoryRepository;
    }
}
