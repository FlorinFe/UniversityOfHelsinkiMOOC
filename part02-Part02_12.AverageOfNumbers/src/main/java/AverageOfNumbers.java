
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberofnumbers = 0, sumofnumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine()) ;
            
            numberofnumbers = numberofnumbers + 1;
            sumofnumbers = sumofnumbers + input;
            
            if (input == 0) {
                break;
            }

            
            
        
        
        
        }//inchide loopul   
        System.out.println("Average of the numbers: " + (1.0 * sumofnumbers  / (numberofnumbers -1)));

    }
}
