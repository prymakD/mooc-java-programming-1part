
public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public Item(String identifier) {
        this(identifier, "");
    }
    
    public boolean equals(Object compared) {
        if (this == compared) return true;
        
        if (!(compared instanceof Item)) return false;
        
        Item other = (Item) compared;
        
        return this.identifier.equals(other.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
