
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int index = 0;

        while (true) {
            System.out.println("Give a number:");

            int num = Integer.valueOf(scanner.nextLine());

            if (num != 0) {
                total += num;
                index++;
            } else {
                break;
            }
        }

        System.out.println("Number of numbers: "+index);
        System.out.println("Sum of the numbers: "+ total);

    }
}
