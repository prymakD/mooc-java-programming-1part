
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class UserInterface {

    private ArrayList<Bird> birds;
    private Bird bird;
    private Scanner scanner;

    public UserInterface() {
        this.birds = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        loop:
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            switch (input) {
                case "Quit":
                    break loop;
                case "Add":
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    birds.add(new Bird(name, latinName));
                    break;
                case "All":
                    for (Bird bird : birds) {
                        System.out.println(bird);
                    }
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String nameToObserve = scanner.nextLine();
                    isABird(searchBird(nameToObserve, birds));
                    break;
                case "One":
                    System.out.println("Bird? ");
                    String nameOfBird = scanner.nextLine();
                    System.out.println(searchBird(nameOfBird, birds));
                    break;
            }

        }

    }

    public Bird searchBird(String name, ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public void isABird(Bird bird) {
        if (Objects.isNull(bird)) {
            System.out.println("Not a bird!");
        } else {
            bird.observe();
        }
    }
}
