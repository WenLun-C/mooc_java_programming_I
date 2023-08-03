
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            String[] commands = input.split(" ");
            
            if (commands[0].equals("add")) {
                int amt = Integer.valueOf(commands[1]);
                first.add(amt);
            } else if (commands[0].equals("move")) {
                int amt = Integer.valueOf(commands[1]);
                if (first.contains() > 0) {
                    int remove = (first.contains() < amt) ? first.contains() : amt;
                    first.remove(remove);
                    second.add(remove);
                }
            } else if (commands[0].equals("remove")) {
                int amt = Integer.valueOf(commands[1]);
                second.remove(amt);
            } else if (commands[0].equals("quit")) {
                break;
            }

        }
    }

}
