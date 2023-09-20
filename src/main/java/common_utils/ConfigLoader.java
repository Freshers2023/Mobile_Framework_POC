package common_utils;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class ConfigLoader {
    public Map getCapability() {
        JsonPath jsonPath = null;
        try {
            String path = System.getProperty("user.dir") + FilePaths.CAPABILITIES;
            jsonPath = new JsonPath(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return jsonPath.getMap(".");
    }

    public Map getJSON(String filePaths) {
        JsonPath jsonPath = null;
        try {
            String path = System.getProperty("user.dir") + filePaths;
            jsonPath = new JsonPath(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return jsonPath.getMap(".");
    }
}
