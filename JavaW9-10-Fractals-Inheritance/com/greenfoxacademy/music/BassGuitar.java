package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {

    int numberOfStrings;

    public BassGuitar() {
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public void play() {
        System.out.print("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes ");
        this.sound();
    }

    @Override
    public void sound() {
        String sound = "Duum-duum-duum";
        System.out.println(sound);
    }

}
