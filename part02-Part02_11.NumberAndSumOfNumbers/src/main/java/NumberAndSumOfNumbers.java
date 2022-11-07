
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of numbers: " + (numberofnumbers - 1));
        System.out.println("Sum of the numbers: " + sumofnumbers);
    }
}
