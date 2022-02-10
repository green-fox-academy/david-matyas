package com.gfa;

public class Mentor extends Person{
String level;

    public Mentor() {
        this.level = "intermediate";
    }


    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
    @Override
    public void introduce() {
        String introduce =
                "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.";
        System.out.println(introduce);
    }

}
