import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scanner = scan;
        this.dict = dict;
    }

    public void start(){
        while (true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String trans = this.scanner.nextLine();
                this.dict.add(word, trans);

            } else if (input.equals("search")) {
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                String trans = this.dict.translate(word);
                if (trans != null) {
                    System.out.println("Translation: "+ this.dict.translate(word));
                } else {
                    System.out.println("Word "+ word + " was not found");
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
