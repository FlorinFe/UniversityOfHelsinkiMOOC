
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
public class Package {

    private ArrayList<Gift> elements;

    public Package() {
        elements = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        elements.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift oricare : elements) {
            totalWeight = totalWeight + oricare.getWeight();
        }
        return totalWeight;
    }
}
