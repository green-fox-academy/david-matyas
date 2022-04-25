package com.gfa.dependeciesexcersies.color;

import com.gfa.dependeciesexcersies.service.MyColor;
import com.gfa.dependeciesexcersies.service.Printer;

public class BlueColorImp implements MyColor {
    private final Printer printer;

    public BlueColorImp(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
