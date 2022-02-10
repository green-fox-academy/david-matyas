package com.gfa;

import java.util.ArrayList;
import java.util.List;


public class Cohort {
    String name;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Mentor> mentors = new ArrayList<Mentor>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void addMentor(Mentor newMentor) {
        mentors.add(newMentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " " +
                "mentors.");
    }
}
