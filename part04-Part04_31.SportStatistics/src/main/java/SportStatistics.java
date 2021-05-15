
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))) {
            ArrayList<String> win = new ArrayList<>();
            ArrayList<String> loose = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] lines = line.split(",");
                
                String home = lines[0];
                String visit = lines[1];
                int homePoints = Integer.valueOf(lines[2]);
                int visitPoints = Integer.valueOf(lines[3]);
                
                if (homePoints > visitPoints) {
                    win.add(home);
                    loose.add(visit);
                } else if (visitPoints > homePoints) {
                    win.add(visit);
                    loose.add(home);
                }
            }
            System.out.println("Team: ");
            String userTeam = scan.nextLine();
            int wins = Collections.frequency(win, userTeam);
            int looses = Collections.frequency(loose, userTeam);
            int games = Collections.frequency(win, userTeam) + Collections.frequency(loose, userTeam);
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + looses);
            
        } catch (Exception e) {
        }

    }

}
