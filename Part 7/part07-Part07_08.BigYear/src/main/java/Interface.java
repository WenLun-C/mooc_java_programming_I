import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    private Scanner scan;
    private ArrayList<Bird> birds;

    public Interface(Scanner scan) {
        this.scan = scan;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while(true) {
            System.out.println("?");
            String command = this.scan.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String name = this.scan.nextLine();
                System.out.println("Name in Latin:");
                String nameLatin = this.scan.nextLine();
                Bird bird = new Bird(name, nameLatin);
                this.birds.add(bird);

            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = this.scan.nextLine();
                for (Bird bird: this.birds) {
                    if (bird.getName().equals(name)){
                        bird.addObserve();
                        break;
                    }
                }

            } else if (command.equals("All")) {
                for (Bird bird: this.birds) {
                    System.out.println(bird.toString());
                }

            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = this.scan.nextLine();
                for (Bird bird: this.birds) {
                    if (bird.getName().equals(name)){
                        System.out.println(bird.toString());
                        break;
                    }
                }

            }
        }
    }
}
