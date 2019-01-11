package ru.rzn.sbt.javaschool.lesson3.musician;

public class Voсalist extends Musician {
    private String[] song;
    private int curentRow;

    public Voсalist() {
        this.curentRow =0;
        this.song = new String[4];
        this.song[0] = new String("Take me to the magic of the moment");
        this.song[1] = new String("on a glory night");
        this.song[2] = new String("Where the children of tomorrow dream away");
        this.song[3] = new String("In the Wind of Change");
    }

    @Override
    public String sing() {
        String result = song[curentRow];
        curentRow++;
        curentRow = curentRow % 4;
        return result;
    }

    @Override
    public String playGuitar() {
        return null;
    }

}
