import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    private Scanner scan;
    private ArrayList<Recipe> recipes;

    public Interface(Scanner scan) {
        this.scan = scan;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.println("File to read:");
        String file = this.scan.nextLine();
        readFile(file);
        System.out.println("");

        while(true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.println("Enter command:");
            String command = this.scan.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                for (Recipe i : this.recipes) {
                    System.out.println(i.toString());
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = this.scan.nextLine();
                System.out.println("Recipes:");
                System.out.println(searchName(name));
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(this.scan.nextLine());
                System.out.println("Recipes:");
                System.out.println(searchTime(time));
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = this.scan.nextLine();
                System.out.println("Recipes:");
                System.out.println(searchIngredient(ingredient));
            }
        }
    }

    public void readFile(String file) {
        System.out.println(Paths.get(file));
        try (Scanner read = new Scanner(Paths.get(file))){
            ArrayList<String> readRecipe = new ArrayList<>();
            while(read.hasNextLine()) {
                String str = read.nextLine();
                if (str.isEmpty()) {
                    Recipe recipe = new Recipe(readRecipe);
                    this.recipes.add(recipe);
                    readRecipe.clear();
                } else {
                    readRecipe.add(str);
                }
            }
            Recipe recipe = new Recipe(readRecipe);
            this.recipes.add(recipe);
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public String searchName(String name) {
        String str = "";
        for (Recipe i : this.recipes) {
            if (i.getName().contains(name)) {
                str += i.toString() + "\n";
            }
        }
        return str;
    }

    public String searchTime(int time) {
        String str = "";
        for (Recipe i : this.recipes) {
            if (i.getTime() <= time) {
                str += i.toString() + "\n";
            }
        }
        return str;
    }

    public String searchIngredient(String ingredient) {
        String str = "";
        for (Recipe i : this.recipes) {
            if (i.getIngredients().contains(ingredient)) {
                str += i.toString() + "\n";
            }
        }
        return str;
    }
    
}
