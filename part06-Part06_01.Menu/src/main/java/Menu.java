
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
        if (!this.meals.contains (meal)) {
            meals.add(meal);
        }
        
    }
    
    public void printMeals() {
        for (String meniuri : this.meals) {
            System.out.println(meniuri);
        }
        
    }
    
    public void clearMenu() {
        meals.removeAll(meals);
        }
        
    }

    // implement the required methods here

