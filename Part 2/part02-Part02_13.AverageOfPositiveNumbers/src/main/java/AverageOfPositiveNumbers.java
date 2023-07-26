
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int index = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0) {
                total += num;
                index++;
            } else if (num == 0) {
                break;
            }
        }

        if (index > 0) {
            System.out.println(total*1.0/index);
        } else {
            System.out.println("Cannot calculate the average");
        }


    }
}
