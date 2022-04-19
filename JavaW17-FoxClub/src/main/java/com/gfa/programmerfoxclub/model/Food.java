package com.gfa.programmerfoxclub.model;

public enum Food {
    MEAT,SEAFOOD,SUSHI,PIZZA,EGG,UHO;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

