
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int val = Integer.valueOf(scan.nextLine());

        if (val < 5000) {
            System.out.println("No Tax!");
        } else if (val <= 25000) {
            double tax = 100 + ((val - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (val <= 55000) {
            double tax = 1700 + ((val - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (val <= 200000) {
            double tax = 4700 + ((val - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (val <= 1000000) {
            double tax = 22100 + ((val - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else {
            double tax = 142100 + ((val - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
