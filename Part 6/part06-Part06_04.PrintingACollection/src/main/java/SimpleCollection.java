
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        } else {
            String str = "The collection " + this.name + " has ";
            if (this.elements.size() == 1) {
                str += "1 element:";
            } else {
                str += this.elements.size() + " elements:";
            }

            for (String i : elements) {
                str += "\n" +i ;
            }

            return str;
        }

    }
    
}
