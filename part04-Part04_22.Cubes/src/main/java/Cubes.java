
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String words = scanner.nextLine();
            
            if (words.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(words);
            System.out.println(Math.pow(number, 3));
        }

    }
}
