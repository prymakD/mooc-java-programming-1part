import java.util.*;

public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int weightTotal = 0;
        for (int i = 0; i < gifts.size(); i++) {
            weightTotal += gifts.get(i).getWeight();
        }
        
        return weightTotal;
    }
}
