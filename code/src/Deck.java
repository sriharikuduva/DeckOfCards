import metadata.Suit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deck {
    private List<BlackjackCard> cards;
    private Date creationDate;

    public Deck() {
        this.creationDate = new Date();
        this.cards = new ArrayList<>();
        for(int value = 1 ; value <= 13 ; value++){
            for(Suit suit : Suit.values()){
                this.cards.add(new BlackjackCard(suit, value));
            }
        }
    }

    public List<BlackjackCard> getCards() {
        return cards;
    }
    public void setCards(List<BlackjackCard> cards) {
        this.cards = cards;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
