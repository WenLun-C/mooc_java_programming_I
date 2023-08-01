import java.util.Scanner;

public class UserInterface {
    private JokeManager joke;
    private Scanner scan;

    public UserInterface(JokeManager jm, Scanner scan) {
        this.joke = jm;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = this.scan.nextLine();
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = this.scan.nextLine();
                this.joke.addJoke(newJoke);
            } else if (command.equals("2")){
                String out = this.joke.drawJoke();
                System.out.println(out);
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.joke.printJokes();
            } else if (command.equals("X")) {
                break;
            }
        }
    }
}
