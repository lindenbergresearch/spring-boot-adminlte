package de.kamasys.webmenu.service;

import de.kamasys.webmenu.config.*;
import de.kamasys.webmenu.json.Naehrwerte;
import de.kamasys.webmenu.model.NutritionalValues;
import de.kamasys.webmenu.repository.NutritionalValuesRepository;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class NutritionalValuesService extends AbstractService<NutritionalValues, Long> {
    // configure logger instance
    private static final Logger log = LoggerFactory.getLogger(NutritionalValuesService.class);

    @Autowired private NutritionalValuesRepository nutritionalValuesRepository;


    @Override
    protected JpaRepository<NutritionalValues, Long> getRepository() {
        return nutritionalValuesRepository;
    }

    /* -------------------------------------------------------- */


    /**
     * Creates a new nutritional record by applying configured field mapping.
     *
     * @param naehrwerte
     * @return
     */
    public NutritionalValues create(Naehrwerte... naehrwerte) throws ReflectiveOperationException, MappingException {
        log.debug("create NutritionalValues from: {}", naehrwerte);

        NutritionalValues nutritionalValues = new NutritionalValues();
        Mapping mapping = AppConfig.getInstance().getMapping();

        for (var value : naehrwerte) {
            log.debug("mapping: {} ", value.getName());
            mapping.applyNutritionalMapping(value, nutritionalValues);
        }

        return nutritionalValues;
    }
}
