package com.engeto.training;

public class Student extends Credentials{
    private int yearOfBirth;
    private String studentID;


    public Student(String forename, String surename, int yearOfBirth, String studentID) {
        super(forename, surename);
        this.yearOfBirth = yearOfBirth;
        this.studentID = studentID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getStudentID() {
        return studentID;
    }
}
