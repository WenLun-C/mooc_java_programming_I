import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(ArrayList<String> strings) {
        this.name = strings.get(0);
        this.time = Integer.valueOf(strings.get(1));
        this.ingredients = new ArrayList<>();
        for (int i = 2; i < strings.size() ;i++) {
            this.ingredients.add(strings.get(i));
        }
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    
    
}
