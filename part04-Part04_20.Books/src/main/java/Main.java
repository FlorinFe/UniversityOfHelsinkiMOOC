import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       ArrayList<Books> carti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
       while (true) {
           
           System.out.println("Title: ");
           String nume = scanner.nextLine();
           
           if (nume.isEmpty()) {
               break;
           }
           
           System.out.println("Pages: ");
           int pagini = Integer.valueOf(scanner.nextLine());
           
           System.out.println("Publication year: ");
           int duratie = Integer.valueOf(scanner.nextLine());
           
           carti.add(new Books(nume , pagini , duratie ));
           
       }//end of While
       
        System.out.println("What information will be printed? ");
        String printOut = scanner.nextLine();
        
        for (Books tv : carti) {
            
            if (printOut.equals("everything")) {
                System.out.println(tv.getTitle() + ", " + tv.getPages() + " pages, " + tv.getYear());
            }else if (printOut.equals("name"))  {
                System.out.println(tv.getTitle());
            }
           
    } //end of program
    }
}