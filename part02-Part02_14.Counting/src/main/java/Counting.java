
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = 0;
        int end = Integer.valueOf(scanner.next());
        
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
    }
}
