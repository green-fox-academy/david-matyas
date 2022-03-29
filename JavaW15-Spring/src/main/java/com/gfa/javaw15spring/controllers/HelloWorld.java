package com.gfa.javaw15spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
public class HelloWorld {
    @GetMapping("sayHello")
    @ResponseBody
    public String handleHello() {
        return "Hello all";
    }

        public String handleScript() {
        return "Hello <script>window.alert(\"sometext\")</script>";
    }
    @GetMapping("/")
    public String handleIndex() {
        return "index";
    }

    @GetMapping("greet")
    @ResponseBody
    public String handleGreeting(@RequestParam(name = "someone") String name,
                                 @RequestParam(required = false, defaultValue = "-1") Integer age) {
        return String.format("Hello %s. Your age is %d",
                Objects.isNull(name) ? "all" : name,
                age);
    }
}
