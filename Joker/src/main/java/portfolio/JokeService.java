package portfolio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JokeService {

    private static final String RANDOM_TEN_JOKE_API_URL = "https://official-joke-api.appspot.com/random_ten";
    private static final String ANY_JOKE_API_URL = "http://v2.jokeapi.dev/joke/Any?amount=10";
    private static final String PROGRAMMING_JOKE_URL = "http://v2.jokeapi.dev/joke/Programming?amount=10";
    private static final String MISC_JOKE_URL = "http://v2.jokeapi.dev/joke/Misc?amount=10";
    private static final String DARK_JOKE_URL = "http://v2.jokeapi.dev/joke/Dark?amount=10";
    private static final String PUN_JOKE_URL = "http://v2.jokeapi.dev/joke/Pun?amount=10";
    private static final String SPOOKY_JOKE_URL = "http://v2.jokeapi.dev/joke/Spooky?amount=10";
    private static final String CHRISTMAS_JOKE_URL = "http://v2.jokeapi.dev/joke/Chrsistmas?amount=10";




    public void getRandomTenJokeList() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(RANDOM_TEN_JOKE_API_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++) {
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();
                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void getAnyJokeList(){

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(ANY_JOKE_API_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();
                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getProgrammingJokeList(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(PROGRAMMING_JOKE_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();
                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getMiscJokeList(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(MISC_JOKE_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();
                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getDarkJokeList(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(DARK_JOKE_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();

                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getPunJokeList(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(PUN_JOKE_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();

                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getSpookyJokeList(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(SPOOKY_JOKE_URL))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++){
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();

                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        }


    public static void getChristmasJokeList(){

    }



    public static void main(String[] args) {
        JokeService service = new JokeService();
        service.getAnyJokeList();
    }
}
