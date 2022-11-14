/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Festila
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> lista;
    
    public Stack (){
    this.lista = new ArrayList<>();
}
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    public void add (String value) {
        lista.add(value);
    }
    public ArrayList<String> values() {
        return lista;
    }
    public String take() {
        String temporary = lista.get(lista.size() -1);
        this.lista.remove(lista.size() -1);
        return temporary;
        
    }


}
