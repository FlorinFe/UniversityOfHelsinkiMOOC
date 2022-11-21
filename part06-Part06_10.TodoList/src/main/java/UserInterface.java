
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
public class UserInterface {
     private TodoList list;
     private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public UserInterface() {
        
    }
     public void start(){
         while (true){
             System.out.println("Command:");
             String word = scanner.nextLine();
             
             if (word.equals("stop")) {
                 break;
             }
             if (word.equals("add"))  {
                 System.out.println("To add:");
                 String toAdd = scanner.nextLine();
                 this.list.add(toAdd);
                 
             }
             if (word.equals("list"))  {
                 list.print();
             }
             if (word.equals("remove"))  {
                 System.out.println("Which one is removed?");
                 int num = scanner.nextInt();
                 list.remove(num);
                 
             }
             }
         }
     }

