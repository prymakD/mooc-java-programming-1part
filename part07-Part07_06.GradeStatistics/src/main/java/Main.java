
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grading grade = new Grading();
        Interface interface1 = new Interface(scanner, grade);
        
        interface1.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
