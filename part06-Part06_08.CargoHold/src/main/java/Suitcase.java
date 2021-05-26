
import java.util.*;

public class Suitcase {

    private int weightMax;
    private ArrayList<Item> items;
    
    public Suitcase(int weightMax) {
        this.weightMax = weightMax;
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void addItem(Item item) {
        if (this.weightMax >= (this.totalWeight() + item.getWeight())) {
            items.add(item);    
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }

    public int getWeightMax() {
        return weightMax;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnObject = this.items.get(0);
        
        for (Item item : items) {
            if (returnObject.getWeight() < item.getWeight()) {
                returnObject = item;
            }
        }
        
        return returnObject;
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else
            
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
