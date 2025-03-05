

// Main.java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
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
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.displayDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled!");
                    break;
                case 3:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 4:
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    deck.findCard(suit, rank);
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}
