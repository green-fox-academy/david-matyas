package com.gfa.dependeciesexcersies;

import com.gfa.dependeciesexcersies.service.MyColor;
import com.gfa.dependeciesexcersies.service.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependeciesExcersiesApplication implements CommandLineRunner {

    private final Printer printer;
    private final MyColor myColor;
    public DependeciesExcersiesApplication(Printer printer, MyColor myColor) {
         this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependeciesExcersiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(" Good morning sunshine ");
        myColor.printColor("Blue");


    }
}
