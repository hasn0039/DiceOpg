package com.company;

public class Main {

    public static void main(String[] args) {
	Dice d1 = new Dice(0);
	//jeg intialisere mit første dice objekt
        System.out.println(d1);//printer d1
        //her bruger jeg roll for at generere en random værdi
        d1.roll();
        System.out.println(d1);//printer d1 med den random værdi og prøver det 3 gange
        d1.roll();
        System.out.println(d1);
        d1.roll();
        System.out.println(d1);

    }
}
