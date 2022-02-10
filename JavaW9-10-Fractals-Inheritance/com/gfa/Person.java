package com.gfa;

public class Person {
    String name;
    int age;
    String gender;

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public void introduce() {
        String introduce = "Hi, I'm " + name + ", a " + age + " year old " + gender + ".";
        System.out.println(introduce);

    }

}
