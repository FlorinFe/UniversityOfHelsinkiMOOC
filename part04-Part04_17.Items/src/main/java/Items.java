
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
   while (true) {
       System.out.println("Name: ");
    String input = scanner.nextLine();
    items.add(new Item(input));
    if (input.isEmpty()) {
        break;
    } // end of IF
    
   }// end of WHILE 
   
        
   for (Item item : items); {
        System.out.println(items);
    }
   
    } //end of program
    
} // end of MAIn
   
   
  