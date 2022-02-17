package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
    int numberOfStrings;

    public Violin() {
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.print("Violin, a " + numberOfStrings + "-stringed instrument that goes ");
        this.sound();
    }

    @Override
    public void sound() {
        String sound = "Screech";
        System.out.println(sound);
    }

}
