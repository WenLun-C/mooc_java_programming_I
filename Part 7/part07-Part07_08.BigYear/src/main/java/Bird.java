public class Bird {
    private String name;
    private String latin;
    private int count;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }

    public void addObserve() {
        this.count++;
    }

    public int getObserve() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.latin + "): " + this.count + " observations";
    }
    
}
