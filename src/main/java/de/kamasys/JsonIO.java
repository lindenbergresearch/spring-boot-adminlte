package de.kamasys.webmenu;

import com.google.gson.Gson;
import de.kamasys.webmenu.json.JsonRoot;


import java.io.*;

/**
 *
 */
public class JsonIO {

    /**
     * @param json
     * @return
     */
    public static JsonRoot createFromString(String json) {
        Gson gson = new Gson();
        JsonRoot root = gson.fromJson(json, JsonRoot.class);

        //TODO handle io exception?

        return root;
    }


    /**
     * @param file
     * @return
     * @throws IOException
     */
    public static JsonRoot createFromFile(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            if (sb.length() > 0)
                return createFromString(sb.toString());

            return null;
        }

    }


}
