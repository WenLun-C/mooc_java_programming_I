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
        if (jokes.size() > 0) {
            Random random = new Random();
            return this.jokes.get(random.nextInt(this.jokes.size()));
        } else {
            return "Jokes are in short supply.";
        }
    }

    public void printJokes() {
        for (String j : this.jokes) {
            System.out.println(j);
        }
    }
    
}
