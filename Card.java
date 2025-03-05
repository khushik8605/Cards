// Card.java
public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    public boolean sameSuit(Card other) {
        return this.suit.equals(other.suit);
    }


    public boolean sameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    public boolean equals(Card other) {
        return this.suit.equals(other.suit) && this.rank.equals(other.rank);
    }
}

