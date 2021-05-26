
import java.util.*;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int weightMax;

    public Hold(int weightMax) {
        this.weightMax = weightMax;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.weightMax >= (this.totalWeight() + suitcase.getWeightMax())) {
            suitcases.add(suitcase);    
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight() + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
