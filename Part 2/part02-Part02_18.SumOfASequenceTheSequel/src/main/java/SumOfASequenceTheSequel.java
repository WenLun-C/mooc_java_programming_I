
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First numner?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Last numner?");
        int end = Integer.valueOf(scanner.nextLine());

        int total = 0;

        for (int i = start; i <= end; i++) {
            total += i;
        }

        System.out.println("The sum is "+ total);
    }
}
