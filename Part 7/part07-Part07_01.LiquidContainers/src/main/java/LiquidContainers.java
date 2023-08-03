
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] commands = input.split(" ");
            
            if (commands[0].equals("add")) {
                int amt = Integer.valueOf(commands[1]);
                if (amt > 0) {
                    first+=amt;
                    first = (first > 100) ? 100 :first;
                }
            } else if (commands[0].equals("move")) {
                int amt = Integer.valueOf(commands[1]);
                if (first >= amt) {
                    first-=amt;
                    second+=amt;
                } else if (first > 0) {
                    second += first;
                    first = 0;
                }
                second = (second > 100 )? 100 : second;
            } else if (commands[0].equals("remove")) {
                int amt = Integer.valueOf(commands[1]);
                if (second >= amt) {
                    second-=amt;
                }
            } else if (commands[0].equals("quit")) {
                break;
            }

        }
    }

}
