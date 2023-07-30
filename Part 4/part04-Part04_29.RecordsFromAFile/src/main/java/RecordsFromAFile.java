
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()) {
                String contents = scan.nextLine();
                String[] content = contents.split(",");
                System.out.println(content[0] + ", age: " + content[1] + " years");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
