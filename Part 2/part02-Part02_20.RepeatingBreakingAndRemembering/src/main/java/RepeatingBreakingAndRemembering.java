
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int index = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers");

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            } 

            total += num;
            index++;
            if (num%2 ==0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ total);
        System.out.println("Numbers: "+ index);
        System.out.println("Average: "+ total*1.0/index);
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);




    }
}
