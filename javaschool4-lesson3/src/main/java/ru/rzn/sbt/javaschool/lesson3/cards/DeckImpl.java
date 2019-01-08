package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {
    private CardImpl[][] cards;

    public DeckImpl() {
        cards = new CardImpl[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                cards[i][j] = new CardImpl(i, j);
            }
        }
    }

    //метод получения произвольной карты из колоды
    public CardImpl getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}
