
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Festila
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return this.persons.isEmpty();
        }
        return false;
    }
   public ArrayList<Person> getPersons() {
        return this.persons;
           
   }
  public Person shortest() {
      if (persons.isEmpty()){
          return null;
      }
      Person shortestP = this.persons.get(0);
      
      for (Person element : persons)
          if (element.getHeight() < shortestP.getHeight())
              shortestP = element;
      return shortestP;
  } 
  public Person take() {
      if (persons.isEmpty()){
          return null;
  }
      Person shortestPerson = shortest();

        this.persons.remove(shortestPerson);

        return shortestPerson;
}
  
}