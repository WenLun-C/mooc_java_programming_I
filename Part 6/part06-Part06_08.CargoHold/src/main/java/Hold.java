import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weight) {
        this.maxWeight = weight;
        this.totalWeight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suit) {
        if (this.totalWeight + suit.totalWeight() <= this.maxWeight) {
            suitcases.add(suit);
            this.totalWeight += suit.totalWeight();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase i : suitcases) {
            i.printItems();
        }
    }
    
}
