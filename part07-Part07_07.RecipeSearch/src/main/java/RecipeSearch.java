
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = readFromFile(file);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        loop:
        while (true) {
            System.out.print("Enter command: ");

            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    break loop;
                case "list":
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe);
                    }
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();
                    System.out.println("Recipes:");
                    System.out.println(searchByName(searchedWord, recipes));
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int timeInput = Integer.valueOf(scanner.nextLine());
                    System.out.println("Recipes:");
                    searchByTime(timeInput, recipes);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingridient = scanner.nextLine();
                    System.out.println("Recipes:");
                    searchByIngridient(ingridient, recipes);
                    break;
            }
        }
    }

    public static ArrayList<Recipe> readFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int time = Integer.valueOf(scanner.nextLine());

                Recipe recipe = new Recipe(name, time);

                recipes.add(recipe);

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return recipes;
    }

    public static Recipe searchByName(String name, ArrayList<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                return recipe;
            }
        }
        return null;
    }

    public static void searchByTime(int time, ArrayList<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public static void searchByIngridient(String ingr, ArrayList<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngridients().contains(ingr)) {
                System.out.println(recipe);
            }
        }
    }

}
