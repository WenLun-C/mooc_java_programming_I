
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String i = scanner.nextLine();
            if (i.isEmpty()) {
                break;
            }
            String[] words = i.split(",");
            int age = Integer.valueOf(words[1]);

            if (age > oldest) {
                oldest = age;
                name = words[0];
            }
    
        }

        System.out.println("Name of the oldest: " + name);


    }
}
