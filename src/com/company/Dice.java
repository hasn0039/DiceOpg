package com.company;

import java.util.Random;

public class Dice {
    //fields
    int facevalue;

    //konstruktor
public Dice(int facevalue ){
    this.facevalue = facevalue;
}


    //metode
    public int roll(){
        //Random rn = new Random();
        int randomNum = (int)(Math.random()*6)+1;
        return facevalue = randomNum;
    }

    public int getvalue(){
    return facevalue;
    }
    @Override
    public String toString(){
    return "terningen viser= "+facevalue+" øjne";
}

}
