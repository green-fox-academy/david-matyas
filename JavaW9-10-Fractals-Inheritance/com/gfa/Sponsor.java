package com.gfa;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        String introduce =
                "Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired" +
                        " " + hiredStudents + " students so far.";
        System.out.println(introduce);
    }

    public void hire() {
        hiredStudents += 1;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
