
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String i = scanner.nextLine();
            if (i.isEmpty()) {
                break;
            }
            String[] words = i.split(" ");
    
            System.out.println(words[0]);
        }

    }
}
