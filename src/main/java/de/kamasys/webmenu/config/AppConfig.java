
package de.kamasys.webmenu.config;

import com.google.gson.annotations.SerializedName;
import de.kamasys.webmenu.JsonIO;
import lombok.*;
import org.slf4j.*;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
@Getter
@Setter
public class AppConfig {
    private static final Logger log = LoggerFactory.getLogger(AppConfig.class);


    @SerializedName("Mapping")
    private Mapping mapping;

    @SerializedName("Options")
    private Options options;

    @SerializedName("Version")
    private Version version;


    /* -------------------------------------------------------- */

    /* application config instance */
    private static AppConfig instance;


    /**
     * Load and return the current app config instance.
     *
     * @param fileName The path to the json file holding the config.
     * @return AppConfig instance.
     */
    public static void load(String fileName) {
        try {
            if (instance == null)
                instance = JsonIO.createFromFile(fileName, AppConfig.class);
        } catch (Exception e) {
            log.warn(
                "Error while reading application configuration from: {} => {}",
                fileName,
                e.getMessage()
            );

            log.info("Using default config.");
            instance = new AppConfig();
        }

        log.info("Application configuration successfully loaded.");
    }


    /**
     * Return the current app config instance.
     *
     * @return AppConfig instance.
     */
    public static AppConfig getInstance() {
        if (instance != null) return instance;
        else return new AppConfig(); // be save
    }
}
