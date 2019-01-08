package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {
    private int suit; // масть карты
    private int rank;//достоинство

    static final int DIAMONDS = 0;
    static final int CLUBS = 1;
    static final int HEARTS = 2;
    static final int SPADES = 3;

    static final int TUZ = 0;
    static final int SIX = 1;
    static final int SEVEN = 2;
    static final int EIGTH = 3;
    static final int NINE = 4;
    static final int TEN = 5;
    static final int VALET = 6;
    static final int DAMA = 7;
    static final int KOROL = 8;


    public CardImpl(int s, int r) {
        this.rank = r;
        this.suit = s;
    }

    @Override

    public String toString() {
//        CardImpl that = (CardImpl) obj;
        String result = "";
        if (this != null) {
            switch (this.rank) {
                case 0:
                    result = "туз ";
                    break;
                case 1:
                    result = "шестёрка ";
                    break;
                case 2:
                    result = "семёрка ";
                    break;
                case 3:
                    result = "восьмёрка ";
                    break;
                case 4:
                    result = "девятка ";
                    break;
                case 5:
                    result = "десятка ";
                    break;
                case 6:
                    result = "валет ";
                    break;
                case 7:
                    result = "дама ";
                    break;
                case 8:
                    result = "король ";
                    break;
            }
            switch (this.suit) {
                case 0:
                    result += "бубны";
                    break;
                case 1:
                    result += "трефы";
                    break;
                case 2:
                    result += "червы";
                    break;
                case 3:
                    result += "пики";
                    break;
            }
        }
        return result;
    }
}
