public class Song {

    private String name;
    private int length;

    public Song(String name, int len) {
        this.name = name;
        this.length = len;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
    
}
