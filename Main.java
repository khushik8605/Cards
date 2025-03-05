//Khushi Kashyap
//23070126060
//AIML A3

// Main.java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Print a Card");
            System.out.println("4. Find a Card");
            System.out.println("5. Find Same Suit Cards");
            System.out.println("6. Find Same Rank Cards");
            System.out.println("7. Deal 5 Random Cards");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
        } while (choice != 8);

        scanner.close();
    }
}
