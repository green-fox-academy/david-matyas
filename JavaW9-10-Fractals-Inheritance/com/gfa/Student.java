package com.gfa;

public class Student extends Person {
    String previousOrganization;
    int skippedDay;


    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDay = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDay = 0;
    }

    public void introduce() {
        String introduce =
                "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who " +
                        "skipped " + skippedDay + " days from the course already.";
        System.out.println(introduce);
    }

    public void skipDays(int numberOfDays) {
        skippedDay += numberOfDays;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }
}
