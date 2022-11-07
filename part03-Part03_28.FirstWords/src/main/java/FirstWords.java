
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String [] arraywords;
        
        while (true) {
            String Input = scanner.nextLine();
            if (Input.equals("")) {
                break;
            }
            arraywords = Input.split(" ");
           System.out.println(arraywords[0]);
        }
        
        


    }
}
