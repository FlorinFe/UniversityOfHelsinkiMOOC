
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String document = scan.nextLine();
        
        System.out.println("Team:");
        String Team = scan.nextLine();
        
        ArrayList people = new ArrayList<>();
        int counterHT = 0;
        int counterVT = 0;
        int counterTotal = 0;
        int wins = 0;
        int loses = 0;
        
        
        try (Scanner scanner = new Scanner(Paths.get(document))) {

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

        String[] parts = line.split(",");
        String homeTeam = parts[0];
        String visitingTeam = parts[1];
        int homeTeamPoints = Integer.valueOf(parts[2]);
        int visitingTeamPoints = Integer.valueOf(parts[3]);
        
        if (Team.equals(homeTeam)) {
            counterHT++;
            if (homeTeamPoints > visitingTeamPoints) {
                wins++;
            }else {
                loses++;
            }
            
        } else if (Team.equals(visitingTeam)) {
            counterVT++;
            if (homeTeamPoints < visitingTeamPoints) {
                wins++;
            }else {
                loses++;
            }
    
        } 
        
        
        

        
    }
}       catch (IOException ex) {
            System.out.println("ERRRRRROOORRRR");
        }

        counterTotal = counterHT + counterVT;
        System.out.println("Games: " + counterTotal);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    }

}
