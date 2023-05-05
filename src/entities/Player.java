package entities;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void AddCard(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int numAces = 0;
        for (Card card : hand) {
            value += card.getNumericalValue();
            if(card.getValue().equals("Ace")) {
                numAces++;
            }
        }
        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }
        return value;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void clearHand() {
        hand.clear();
    }
}
