package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {
    int numberOfStrings;

    public ElectricGuitar() {
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.print("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes ");
        this.sound();
    }

    @Override
    public void sound() {
        String sound = "Twangg";
        System.out.println(sound);
    }
}
