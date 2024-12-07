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
    private static final String CHRISTMAS_JOKE_URL = "http://v2.jokeapi.dev/joke/Christmas?amount=10";



    private void fetchAndPrintJokes(String apiUrl) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(apiUrl))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonArray jokesArray = JsonParser.parseString(response.body()).getAsJsonArray();

            for (int i = 0; i < jokesArray.size(); i++) {
                JsonObject jokeObject = jokesArray.get(i).getAsJsonObject();

                String type = jokeObject.get("type").getAsString();
                String setup = jokeObject.get("setup").getAsString();
                String punchline = jokeObject.get("punchline").getAsString();

                System.out.println(type + " | " + setup + " | " + punchline);
            }
        } catch (Exception e) {
            System.err.println("Failed to fetch jokes from: " + apiUrl);
            e.printStackTrace();
        }
    }




    public void getRandomTenJokeList() {
        fetchAndPrintJokes(RANDOM_TEN_JOKE_API_URL);
    }

    public void getAnyJokeList() {
        fetchAndPrintJokes(ANY_JOKE_API_URL);
    }

    public void getProgrammingJokeList() {
        fetchAndPrintJokes(PROGRAMMING_JOKE_URL);
    }

    public void getMiscJokeList() {
        fetchAndPrintJokes(MISC_JOKE_URL);
    }

    public void getDarkJokeList() {
        fetchAndPrintJokes(DARK_JOKE_URL);
    }

    public void getPunJokeList() {
        fetchAndPrintJokes(PUN_JOKE_URL);
    }

    public void getSpookyJokeList() {
        fetchAndPrintJokes(SPOOKY_JOKE_URL);
    }

    public void getChristmasJokeList() {
        fetchAndPrintJokes(CHRISTMAS_JOKE_URL);
    }


    public static void main(String[] args) {
        JokeService service = new JokeService();

        System.out.println("Fetching Programming Jokes...");
        service.getProgrammingJokeList();

        System.out.println("\nFetching Misc Jokes...");
        service.getMiscJokeList();

        System.out.println("\nFetching Dark Jokes...");
        service.getDarkJokeList();

        System.out.println("\nFetching Christmas Jokes...");
        service.getChristmasJokeList();
    }

}
