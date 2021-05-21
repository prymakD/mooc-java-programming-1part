import java.util.*;
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.persons.get(0);
        
        for (Person person : persons) {
            if (returnObject.getHeight() > person.getHeight()) {
                returnObject = person;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        if (this.persons.isEmpty()) {
            return null;
        }
        
        persons.remove(this.shortest());
        return shortest;
    }
}
