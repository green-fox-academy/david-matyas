package com.gfa.dependeciesexcersies.service;

import com.gfa.dependeciesexcersies.service.MyColor;
import com.gfa.dependeciesexcersies.service.Printer;
import org.springframework.stereotype.Service;

@Service
public class MyColorImp implements MyColor {
    private final Printer printer;

    public MyColorImp(Printer printer) {
        this.printer = printer;
    }


    public void printColor(String color) {
        switch (color) {
            case "Blue":
                printer.log("It is blue in color...");
                break;
            case "Red":
                printer.log("It is red in color...");
                break;
            default:
                printer.log("No color");
                break;
        }
    }
}
