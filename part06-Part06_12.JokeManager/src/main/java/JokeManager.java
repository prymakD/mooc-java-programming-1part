
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();
        if (jokes.isEmpty()) return "Jokes are in short supply.";
        
        int randomNum = draw.nextInt(jokes.size());
        return jokes.get(randomNum);
    }
    
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
