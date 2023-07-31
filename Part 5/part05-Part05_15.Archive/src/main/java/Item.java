public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        } 

        if (!(compare instanceof Item)) {
            return false;
        }

        Item item = (Item) compare;

        if (item.id.equals(this.id)) {
            return true;
        }

        return false;
    }
}
