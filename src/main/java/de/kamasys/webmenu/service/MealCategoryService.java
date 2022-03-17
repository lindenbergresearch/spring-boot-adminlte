package de.kamasys.webmenu.service;

import de.kamasys.webmenu.json.Mahlzeiten;
import de.kamasys.webmenu.model.MealCategory;
import de.kamasys.webmenu.repository.MealCategoryRepository;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class MealCategoryService extends AbstractService<MealCategory, Long> {
    // configure logger instance
    private static final Logger log = LoggerFactory.getLogger(MealCategoryService.class);


    @Autowired
    private MealCategoryRepository mealCategoryRepository;


    /* -------------------------------------------------------- */


    /**
     * Adds a meal category by name.
     *
     * @param name
     * @return
     */
    public MealCategory add(String name) {
        return (MealCategory) mealCategoryRepository.save(new MealCategory(name));
    }


    /**
     * Returns or creates the given category from Json object.
     *
     * @param mahlzeiten Source class instance.
     * @return Category instance.
     */
    public MealCategory getOrCreate(Mahlzeiten mahlzeiten) {
        var name = mahlzeiten.getBezeichnung().trim();
        log.debug("get/create meal category by name: {}", name);

        var entityOpt = mealCategoryRepository.findByName(name);
        return (MealCategory) entityOpt.orElse(add(name));
    }


    @Override
    protected JpaRepository<MealCategory, Long> getRepository() {
        return mealCategoryRepository;
    }
}
