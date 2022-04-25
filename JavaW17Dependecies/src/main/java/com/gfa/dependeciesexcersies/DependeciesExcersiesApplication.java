package com.gfa.dependeciesexcersies;

import com.gfa.dependeciesexcersies.service.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependeciesExcersiesApplication implements CommandLineRunner {

    private final Printer printer;
    public DependeciesExcersiesApplication(Printer printer) {
         this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependeciesExcersiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(" Good morning sunshine ");



    }
}
