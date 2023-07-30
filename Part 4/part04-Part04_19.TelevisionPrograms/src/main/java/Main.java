import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());

            TelevisionProgram tv = new TelevisionProgram(name, duration);
            programs.add(tv);
        }

        System.out.println("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram tv : programs) {
            if (tv.getDuration() <= max) {
                System.out.println(tv.toString());
            }

        }

    }
}
