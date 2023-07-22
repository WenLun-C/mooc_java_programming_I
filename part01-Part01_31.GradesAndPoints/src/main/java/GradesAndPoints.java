
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int pts = Integer.valueOf(scan.nextLine());
        String grade = "Grade: ";

        if (pts < 0) {
            System.out.println(grade + "impossible!");
        } else if (pts < 50) {
            System.out.println(grade + "failed");
        } else if (pts < 60) {
            System.out.println(grade + "1");
        } else if (pts < 70) {
            System.out.println(grade + "2");
        } else if (pts < 80){
            System.out.println(grade + "3");
        } else if (pts < 90){
            System.out.println(grade + "4");
        } else if (pts <= 100){
            System.out.println(grade + "5");
        } else {
            System.out.println(grade + "incredible!");
        }
    }
}
