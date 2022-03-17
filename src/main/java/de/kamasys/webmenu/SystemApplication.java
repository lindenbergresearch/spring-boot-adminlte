package de.kamasys.webmenu;

import com.google.gson.JsonSyntaxException;
import de.kamasys.webmenu.config.AppConfig;
import de.kamasys.webmenu.json.*;
import de.kamasys.webmenu.repository.*;
import de.kamasys.webmenu.service.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class SystemApplication {
    // configure logger instance
    private static final Logger log = LoggerFactory.getLogger(SystemApplication.class);

    private static final String APP_CONFIG_FILE = "config/webmenu.json";

    private MealCategoryService mealCategoryService;
    private MealComponentCategoryService mealComponentCategoryService;


    @Autowired
    public void setMealCategoryService(MealCategoryService mealCategoryService) {
        this.mealCategoryService = mealCategoryService;
    }


    @Autowired
    public void setMealComponentCategoryService(MealComponentCategoryService mealComponentCategoryService) {
        this.mealComponentCategoryService = mealComponentCategoryService;
    }


    public static void main(String... args) {
        SpringApplication.run(SystemApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(MealCategoryRepository categoryRepository, MealRepository mealRepository) {
        return (args) -> {
            String fileName = "data/menu.json";
            JsonRoot jsonRoot = null;

            try {
                jsonRoot = JsonIO.createFromFile(fileName, JsonRoot.class);
            } catch (JsonSyntaxException e) {
                log.warn("JSON expetion on reading file: {} => {}", fileName, e.getMessage());
            } catch (IOException e) {
                log.warn("File IO exception while reading JSON: {} => {}", fileName, e.getMessage());
            }

            if (jsonRoot != null) {
                log.info("Read days: {}", jsonRoot.getTage().size());
            }

            AppConfig.load(APP_CONFIG_FILE);

            log.info("WebMenu: {}", AppConfig.getInstance().getVersion());
            log.info("Config => {}", AppConfig.getInstance());

            try {
                Mahlzeiten mahlzeiten = jsonRoot.getTage().get(0).getMahlzeiten().get(0);
                Speisen speisen = jsonRoot.getTage().get(0).getMahlzeiten().get(0).getKategorien().get(0).getSpeisen().get(0);

                mealComponentCategoryService.getOrCreate(speisen);
                mealCategoryService.getOrCreate(mahlzeiten);
            } catch (Exception e) {
                log.debug("DB error: {}" + e.getMessage());
            }
        };
    }
}
