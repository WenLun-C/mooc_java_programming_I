
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String i = scanner.nextLine();
            if (i.isEmpty()) {
                break;
            }
            String[] words = i.split(",");
            int age = Integer.valueOf(words[1]);

            if (age > oldest) {
                oldest = age;
            }
    
        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
