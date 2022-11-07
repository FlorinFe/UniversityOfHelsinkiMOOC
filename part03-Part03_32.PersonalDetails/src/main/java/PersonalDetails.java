
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        int namelength =0;
        int highest =0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//end of if
            
            String[] list = input.split(",");
            sum += Integer.valueOf(list[1]);
            count++;
            
            
            
            namelength = list[0].length();
            
            if (namelength > highest) {
                highest=namelength;
                name = list[0];
            
            
            
            
        }// end of while
     


    }
        System.out.println("Longest name: " + name);
          
        System.out.println("Average of the birth years: " + 1.0 * sum / count);
}
}