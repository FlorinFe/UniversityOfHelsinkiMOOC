
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.equals("end")) {
                break;
                
            
            } //end of IF
            words.add(line);
        }//end of WHILE
        System.out.println(words.size());

    }//end of Program
}
