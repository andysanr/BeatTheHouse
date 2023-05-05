package entities;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand;

    public Dealer() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int numAces = 0;
        for (Card card : hand) {
            value += card.getNumericalValue();
            if (card.getValue().equals("Ace")) {
                numAces++;
            }
        }
        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }
        return value;
    }

    public boolean mustHit() {
        return getHandValue() < 17;
    }

    public void clearHand() {
        hand.clear();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getUpCard() {
        if (hand.size() == 0) {
            return null;
        }
        return hand.get(0);
    }
}
