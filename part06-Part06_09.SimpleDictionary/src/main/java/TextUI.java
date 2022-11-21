
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Festila
 */
public class TextUI {
   private SimpleDictionary dictionary;
   private Scanner scanner;
   
   public TextUI(Scanner scanner, SimpleDictionary dictionary) {
       this.dictionary = dictionary;
       this.scanner = scanner;
   }
   public void start() {
        while (true) {
            System.out.println("Command:");  
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }//end of IFF 
            if (word.equals("add")) {
                System.out.println("Word:");
                String cuvant = scanner.nextLine();
                System.out.println("Translation:");
                String tarnslation = scanner.nextLine();
                
                dictionary.add(cuvant , tarnslation);
            } //end of IFF
            if (word.equals("search")){
                System.out.println("To be translated:"); 
                String wordTranslated = scanner.nextLine();
                
                if (dictionary.translate(wordTranslated) == null) {
                    System.out.println("Word " + wordTranslated + " was not found");
                    
                }else{
                    System.out.println(dictionary.translate(wordTranslated));
                }
            }
            else {
                System.out.println("Unknown command");
            }
        //end of WHILE
   }
    
}
}