//package portfolio;
//
//import io.javalin.Javalin;
//
//public class JokeApp {
//
//    public static void main(String[] args){
//        Javalin app = Javalin.create().start(7000);
//
//        app.get("/", ctx -> ctx.html("Welcome to the Joke App!"));
//
//        app.get("/joke", ctx -> {
//            String joke = JokeService.getRandomJoke();
//            ctx.result(joke);
//        });
//    }
//}
