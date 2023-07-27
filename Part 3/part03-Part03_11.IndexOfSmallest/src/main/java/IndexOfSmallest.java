
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int small = 9999;
        int index = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            if (small > input) {
                small = input;
                index = numbers.size();
            }

            numbers.add(input);
        }

        System.out.println("Smallest number: " + small);
        System.out.println("Found at index: " + index);

        
    }
}
