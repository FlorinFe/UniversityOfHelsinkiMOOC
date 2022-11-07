
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("First Number?");
        int first =scanner.nextInt();
        int sum = 0;
        System.out.println("Last number?");
        int last = scanner.nextInt();
        
        for (int i = first; first <= last; first ++) {
            sum = first + sum;
        }
    
        System.out.println("The sum is " + sum);


    }
}
