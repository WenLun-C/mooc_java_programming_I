public class Book {

    private String name;
    private int page;
    private int year;

    public Book(String name, int page, int year) {
        this.name = name;
        this.page = page;
        this.year = year;
    }

    public String name() {
        return this.name;
    }

    public int page() {
        return this.page;
    }

    public int year() {
        return this.year;
    }

    public String toString() {
        return name() + ", " + page() + " pages, " + year();
    }
    
}
