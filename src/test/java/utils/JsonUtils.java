package utils;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {

    public JSONObject parseJSON() throws IOException {
    String content = new String(Files.readAllBytes(Paths.get("src/test/resources/jsons/create_user.json")));
    return new JSONObject(content);
    }
}
