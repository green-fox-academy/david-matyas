package com.gfa.programmerfoxclub.model;

public enum Drink {
    JUICE,GIN,BEER,WATER;
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

}
