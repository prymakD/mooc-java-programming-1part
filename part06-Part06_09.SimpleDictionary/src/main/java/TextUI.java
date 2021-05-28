
import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        scan = scanner;
        dict = dictionary;
    }

    public void start() {
      loop: while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break loop;
                case "add":
                    System.out.print("Word: ");
                    String word = scan.nextLine();
                    System.out.print("Translation: ");
                    String translation = scan.nextLine();
                    dict.add(word, translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String toBeTranslated = scan.nextLine();
                    if (dict.translate(toBeTranslated) != null) {
                        System.out.println("Translation: " + dict.translate(toBeTranslated));
                        break;
                    } else {
                        System.out.println("Word " + toBeTranslated + " was not found");
                        break;
                    }
                default:
                    System.out.println("Unknown command");
                    break;
            }
            
            
//            if (command.equals("end")) {
//                System.out.println("Bye bye!");
//                break;
//            } else {
//                System.out.println("Unknown command");
//                continue;
//            }

        }
    }
}
