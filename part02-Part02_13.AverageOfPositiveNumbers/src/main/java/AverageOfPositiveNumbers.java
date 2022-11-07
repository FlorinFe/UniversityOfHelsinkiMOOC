
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberofnumbers = 0, sumofnumbers = 0;
        
        while (true) {
           
            int input = Integer.valueOf(scanner.nextLine()) ;
            
            if (input > 0) {
                numberofnumbers = numberofnumbers + 1;
                sumofnumbers = sumofnumbers + input;
            }
            
            if (input == 0) {
                break;
            }
            
            

        }//end of loop
        
        if (sumofnumbers <=0) {
            System.out.println("Cannot calculate the average");
        }
        if (sumofnumbers > 0) {
            System.out.println("Average of the numbers: " + (1.0 * sumofnumbers  / numberofnumbers));
        }
    }
      
}
