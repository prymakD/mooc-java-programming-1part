
import java.util.Scanner;


public class Interface {
    private Scanner scanner;
    private Grading grading;
    
    public Interface(Scanner scanner, Grading grad) {
        this.scanner = scanner;
        this.grading = grad;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1) {
                System.out.println("Point average (all): " + grading.average());
                printAveragePassing();
                System.out.println("Pass percentage: " + grading.passPercentage());
                break;
            }
            
            grading.add(value);
        }
    }
    
    public void printAveragePassing() {
        if (grading.averagePassing() == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grading.averagePassing());

        }
    }
}
