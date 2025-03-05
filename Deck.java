import java.util.*;

public class Deck {
    private ArrayList<Card> deck;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        deck.clear();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank));
            }
        }
    }
        public void displayDeck() {
        for (Card card : deck) {
            card.printCard();
        }
        System.out.println("Total Cards: " + deck.size());
    }

        public void shuffleDeck() {
        Collections.shuffle(deck);
    }
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            deck.get(index).printCard();
        } else {
            System.out.println("Invalid card index!");
        }
    }

        public void sameCard(String suit) {
        System.out.println("Cards from suit: " + suit);
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                card.printCard();
            }
        }
                public void compareCard(String rank) {
        System.out.println("Cards with rank: " + rank);
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                card.printCard();
            }
        }
    }
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    }


}

