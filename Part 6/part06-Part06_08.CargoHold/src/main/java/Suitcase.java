import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
            this.totalWeight+=item.getWeight();
        }
    }

    public String toString(){
        String str = "";
        if (items.isEmpty()) {
            str += "no items";
        } else if (items.size() <= 1) {
            str += items.size() + " item";
        } else {
            str += items.size() + " items";
        }
        return str + " (" + this.totalWeight + "kg)";
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item heavy = new Item("", 0);
        for (Item item : items) {
            if (item.getWeight() > heavy.getWeight()) {
                heavy = item;
            }
        }
        return heavy;
    }
    
}
