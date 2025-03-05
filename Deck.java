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


}

