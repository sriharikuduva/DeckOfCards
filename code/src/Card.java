import metadata.Suit;

public abstract class Card {
    private int value;
    private Suit suit;


    public Card(Suit suit, int faceValue) {
        this.suit = suit;
        this.value = faceValue;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int rank) {
        this.value = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}


