import java.util.Scanner;
public class StringMenu {
  private static String text="";
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    enterString();
                    break;
                case 2:
                    displayString();
                    break;
                case 3:
                    reverseString();
                    break;
                case 4:
                    countWords();
                    break;
                case 0:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // Menu
    private static void showMenu() {
        System.out.println("\n*****STRING OPERATIONS MENU ****");
        System.out.println("1. Enter a string");
        System.out.println("2. Display the string");
        System.out.println("3. Reverse the string");
        System.out.println("4. Number of words");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
    }

    // Option 1
    private static void enterString() {
        System.out.print("Enter a string: ");
        text = scanner.nextLine();
    }

    // Option 2
    private static void displayString() {
        System.out.println("Entered string: " + text);
    }

    // Option 3
    private static void reverseString() {
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    // Option 4
    private static void countWords() {
        if (text.trim().isEmpty()) {
            System.out.println("Number of words: 0");
            return;
        }
        String[] words = text.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // Pause
    private static void pause() {
        System.out.println("Press any key to return to the menu...");
        scanner.nextLine();
    }
}

