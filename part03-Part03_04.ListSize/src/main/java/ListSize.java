
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);

      
         for (int i = 0; i < numbers.size(); i--) {
    int number = numbers.get(i);
    System.out.println(number);
        
         }
        
      }
    }

