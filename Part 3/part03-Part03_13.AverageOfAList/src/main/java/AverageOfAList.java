
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            sum += input;
            list.add(input);
        }

        System.out.println("Average: "+(sum*1.0)/(list.size()));

        // toteuta listan lukujen summan laskeminen tänne
        
    }
}
