package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private String[] song;
    private int curentRow;

    public GuitarPlayer() {
        this.curentRow = 0;
        this.song = new String[4];

        this.song[0] = new String("C G Dm G");
        this.song[1] = new String("C G");
        this.song[2] = new String("Dm G Am");
        this.song[3] = new String("Am/F G");
    }

    @Override
    public String sing() {return null;    }

    @Override
    public String playGuitar() {
        String result = song[curentRow];
        curentRow++;
        curentRow = curentRow % 4;
        return result;
    }
}
