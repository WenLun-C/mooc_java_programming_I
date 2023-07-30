
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            String res = "";
            while(scan.hasNextLine()) {
                String content = scan.nextLine();
                if (content.equals(searchedFor)) {
                    res = "Found!";
                    break;
                }
            }
            if (res.isEmpty()) {
                res = "Not found.";
            }

            System.out.println(res);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
