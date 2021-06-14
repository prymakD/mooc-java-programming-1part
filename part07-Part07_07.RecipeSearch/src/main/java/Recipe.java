
import java.util.ArrayList;


public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingridients;


    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngridients() {
        return ingridients;
    }
    
    public Recipe(String name, int time) {
        this.name = name;
        this.cookingTime = time;
        this.ingridients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient) {
        this.ingridients.add(ingredient);
    }
    
    public String toString() {
        return this.name + ", cooking time: " + cookingTime;
    }
}
