

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
        


    
    public static void printUntilNumber(int input) {
        
        int counter = 0;
        
        while (counter < input) {
            counter++;
            System.out.println(counter);
        }
    }
}