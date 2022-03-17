package de.kamasys.webmenu;

import com.google.gson.*;

import java.io.*;

/**
 * JSON helper IO methods.
 */
public class JsonIO {

    /**
     * Converts a JSON compliant string into a
     * hierarchic POJO structure.
     *
     * @param json JSON as string.
     * @return The root instance of the converted structure.
     * @throws JsonSyntaxException Raised on malformed JSON.
     */
    public static <T> T createFromString(String json, Class<T> clazz) throws JsonSyntaxException {
        return new Gson().fromJson(json, clazz);
    }


    /**
     * Loads a JSON file and converts it to a
     * hierarchic POJO structure.
     *
     * @param file The path to a valid JSON file.
     * @return The root instance of the converted structure.
     * @throws IOException         Raised on common IO failure.
     * @throws JsonSyntaxException Raised on malformed JSON.
     */
    public static <T> T createFromFile(String file, Class<T> clazz) throws IOException, JsonSyntaxException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        if (sb.length() > 0)
            return createFromString(sb.toString(), clazz);

        throw new JsonSyntaxException("Empty JSON file.");
    }
}
