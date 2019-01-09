package ru.rzn.sbt.javaschool.lesson3.flowers;

public class WestBengal implements Region{
    @Override
    public Flower yourNationalFlower(){
        Jasmine result = new Jasmine();
        return  result ;
    }
}
