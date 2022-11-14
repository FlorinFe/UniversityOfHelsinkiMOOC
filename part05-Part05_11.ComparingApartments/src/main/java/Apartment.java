
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
   

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.squares) {
            return false;
        }
        return true;
    }//end of method

    public int priceDifference(Apartment compared) {
        int price = (this.squares * this.princePerSquare);
        int priceCompared = (compared.squares * compared.princePerSquare);

        if (price > priceCompared) {
            return price - priceCompared;
        }
        return priceCompared - price;

    }
    public boolean moreExpensiveThan(Apartment compared) {
       int price = (this.squares * this.princePerSquare);
        int priceCompared = (compared.squares * compared.princePerSquare);
        return (price > priceCompared) ? true : false;
            
        }
        
    }


