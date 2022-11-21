
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Festila
 */
public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {
    this.list = new ArrayList<>();
}

  public void add(String task) {
      this.list.add(task);
  }  
  
  public void print(){
      int count = 0;

        for (String e : list) {
            count++;
            System.out.println(count+": " + e);
            }
       
            
        }
   public void remove(int number){
       this.list.remove(number -1);
}
}