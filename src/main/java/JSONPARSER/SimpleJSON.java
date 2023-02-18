package JSONPARSER;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class A
{
    public static String getGlobalJSONObject() throws IOException {
        File file = new File("./src/main/resources/DataList.json");
        String st = new String(Files.readAllBytes(Paths.get(file.toURI())), StandardCharsets.UTF_8);
        return st;
    }
}
public class SimpleJSON {
    public static void main(String[] args) throws IOException {
        A a = new A();
        String globalJSONObject = a.getGlobalJSONObject();
        System.out.println(globalJSONObject);
    }
}
