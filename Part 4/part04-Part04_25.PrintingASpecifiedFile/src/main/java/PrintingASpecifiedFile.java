
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its  contents printed?");
        String filename = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(filename))){
            while(scan.hasNextLine()) {
                System.out.print(scan.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
