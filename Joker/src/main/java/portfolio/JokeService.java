package portfolio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JokeService {

    private static final String JOKE_API_URL = "https://official-joke-api.appspot.com/random_ten";

    public void getJokeList() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(JOKE_API_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse the JSON array response
            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            // Iterate through the array and print each joke
            for (int i = 0; i < jokesArray.size(); i++) {
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
                System.out.println("Joke " + (i + 1) + ": " + setup + " " + punchline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JokeService service = new JokeService();
        service.getJokeList();
    }
}
