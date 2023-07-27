
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int index = 0;
        String name = "";

        while (true) {
            String i = scanner.nextLine();
            if (i.isEmpty()) {
                break;
            }
            String[] words = i.split(",");
            int age = Integer.valueOf(words[1]);

            total += age;
            index++;
            if (words[0].length() > name.length()) {
                name = words[0];
            }
    
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: "+ total*1.0/index);


    }
}
