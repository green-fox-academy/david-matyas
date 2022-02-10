package garden;

import java.util.StringJoiner;

public class Tree extends Plant {
    int waterAmount;
    double waterAbsorbtion;

    public Tree(String color, int waterAmount) {
        super(color);
        this.waterAmount = 100;
        this.waterAbsorbtion = 0.4;

    }


}
