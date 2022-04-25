package com.gfa.dependeciesexcersies.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

    @Service
    public static class MyColorImp implements MyColor {
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
}
