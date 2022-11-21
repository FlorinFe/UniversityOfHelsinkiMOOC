
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }
    public String getName() {
        return this.name;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String longest(){
        if (this.elements.isEmpty()) {
            return null;
        }
        String theLongest = this.elements.get(0);
        
        for (String oricare : this.elements) {
            if (theLongest.length() < oricare.length())
                theLongest = oricare;
        }
    return theLongest;
    
}

}
