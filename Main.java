package ivan.samoylov;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    private static final String URL = "https://postman-echo.com/post";

    public static void main(String[] args) {
        String request = "foo1=bar1&foo2=bar2";

        String json = HttpUtil.sendRequest(URL, null, request);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(json).getAsJsonObject();
        String requestResult = gson.toJson(jsonObject);
        System.out.println(requestResult);
    }
}
