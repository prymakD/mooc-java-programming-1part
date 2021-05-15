
public class HealthStation {
    private int number = 0;

    public int weigh(Person person) {
        this.number++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return number;
    }

}
