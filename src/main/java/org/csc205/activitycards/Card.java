package org.csc205.activitycards;

public class Card implements Comparable<Card>{

    private Suit suit;
    private Facevalue value;

    public Card(Suit suit, Facevalue facevalue) {

        this.suit = suit;
        this.value = facevalue;

    }


    @Override
    public int compareTo(Card o) {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Card {");
        sb.append(value);
        sb.append(" of ");
        sb.append(suit);
        sb.append('}');
        return sb.toString();
    }
}
