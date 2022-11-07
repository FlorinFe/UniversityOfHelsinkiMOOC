
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0, count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input < 0) {
                count = count + 1;
            }

            
            
            
            
            
        } //Inchide loop-ul   
        System.out.println("Number of negative numbers: " + count);
    } //inchide programul
}
