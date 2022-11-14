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

public class MessagingService {
   
    private ArrayList<Message> mesaje;
    
    public MessagingService() {
    this.mesaje = new ArrayList<>();
}
    public void add (Message message) {
        String sms = message.getContent();
        if (sms.length() <= 280) {
            mesaje.add(message);
        }// end of IF
    }
    
    public ArrayList<Message> getMessages(){
        return mesaje;
    }
    
}
