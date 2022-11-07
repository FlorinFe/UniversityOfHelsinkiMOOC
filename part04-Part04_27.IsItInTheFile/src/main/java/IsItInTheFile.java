
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row ="";
        boolean isFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner filescan = new Scanner(Paths.get(file))) {
            while (filescan.hasNextLine()) {
                 row = filescan.nextLine();
                
                if (searchedFor.equals(row)) {
                    isFound = true;
                    
                }//end of IF
                    
                
            }
            if (isFound) {
                System.out.println("Found!");
               
            } else {
                
                System.out.println("Not found.");
            }
            
        } catch (IOException ex) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
