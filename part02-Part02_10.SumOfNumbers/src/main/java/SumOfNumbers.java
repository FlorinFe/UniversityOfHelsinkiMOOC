
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            count = count + input;
            if (input == 0) {
                break;
            }
     
        
        
        
        
        
        } //inchide loopul
       
        System.out.println("Sum of the numbers: " + count);
    } //inchide pr0gramul
}
