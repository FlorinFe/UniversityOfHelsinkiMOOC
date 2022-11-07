
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =0 ;
        int highest =0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] col = input.split(",");
            age = Integer.valueOf(col[1]);
            
            if (age > highest) {
                highest = age;
            }
            System.out.println("Age of the oldest: " + highest);
            
            
            
        } //end of while
            


    }
}
