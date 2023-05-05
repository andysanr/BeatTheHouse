package entities;

public class Card {
    private final String suit;
    private final String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getNumericalValue() {
        if (value.equals("Ace")) {
            return 11;
        }
        else if (value.equals("King") || value.equals("Queen") || value.equals("Jack")) {
            return 10;
        }
        else {
            return Integer.parseInt(value);
        }
    }
}
