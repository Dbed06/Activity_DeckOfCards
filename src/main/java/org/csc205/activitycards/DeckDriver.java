package org.csc205.activitycards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
                displayDeck(cards);

                cards.size();
                displayDeck(cards);

    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
