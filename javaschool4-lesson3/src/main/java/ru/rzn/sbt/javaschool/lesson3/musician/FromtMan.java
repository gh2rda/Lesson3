package ru.rzn.sbt.javaschool.lesson3.musician;

public class FromtMan extends Musician {
    private String[] songWord;
    private String[] song;
    private int curentRowWord;
    private int curentRow;
    public FromtMan() {
        this.curentRow = 0;
        this.song = new String[4];

        this.song[0] = new String("C# G# F#");
        this.song[1] = new String("C# G# F#");
        this.song[2] = new String("Em E A5 C");
        this.song[3] = new String("Em G Em G");

        this.curentRowWord = 0;
        this.songWord = new String[4];

        this.songWord[0] = new String("Take advantage while");
        this.songWord[1] = new String("You hang me out to dry");
        this.songWord[2] = new String("But I can't see you every night");
        this.songWord[3] = new String("Free I do");
    }

    @Override
  //  public String sing() {
        public String playGuitar() {

            String result = song[curentRow];
        curentRow++;
        curentRow = curentRow % 4;

        return result;
    }

    @Override
 //   public String playGuitar() {
        public String sing() {

            String result = songWord[curentRowWord];
        curentRowWord++;
        curentRowWord = curentRowWord % 4;
        return result;

    }
}
