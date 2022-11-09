
public class HealthStation {
    
    private int weighings;


    public int weigh(Person person) {
       weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
       int currentWeigth = person.getWeight();
       currentWeigth++;
       person.setWeight(currentWeigth);
    }
    public int weighings() {
        return weighings;
    }

}
