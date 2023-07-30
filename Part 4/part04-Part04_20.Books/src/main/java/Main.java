import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them

        while(true) {
            System.out.println("Title: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int page = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());

            Book book = new Book(name, page, year);
            books.add(book);

        }

        System.out.println("What information will be printed?");
        String info = scan.nextLine();

        for (Book book: books) {
            if (info.equals("everything")) {
                System.out.println( book.toString());
            } else if (info.equals("name")) {
                System.out.println(book.name());
            } 
        }

    }
}
