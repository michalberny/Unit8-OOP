package com.engeto.training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class {
    private String nameOfClassroom;
    private int yearOfStudies;
    Teacher teacher;
    List<Student> list = new ArrayList<>();

    public Class(String nameOfClassroom, int yearOfStudies, Teacher teacher, List<Student> list) {
        this.nameOfClassroom = nameOfClassroom;
        this.yearOfStudies = yearOfStudies;
        this.teacher = teacher;
        this.list = list;
    }

    public void printClassroom(){
        System.out.println("##############################");
        System.out.println("Třída: " + nameOfClassroom + " (ročník: " + yearOfStudies + " )");
        System.out.println("Třídní učitel: " + teacher.getSurename() + ", " + teacher.getForename());
        System.out.println("Počet studentů: " + list.size() + "\n");
    }

    public void printStudents() {
        System.out.println("###############################");

        for (int i = 0; i < list.size(); i++){
            int ID = 1;
            System.out.println("# " + (ID+i) + " # " + list.get(i).getStudentID() + " - " +
                    list.get(i).getForename() + " " + list.get(i).getSurename() +
                    " (" + list.get(i).getYearOfBirth() + ")");
        }
    }

    public void printClassroomDetails() {
        System.out.println("\n" + nameOfClassroom + ", " + teacher.getForename() + " " + teacher.getSurename());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getStudentID() + ", " + list.get(i).getForename()
                    + " " + list.get(i).getSurename());
        }
    }

    public void exportToTextFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Třídní učitel: " + teacher.getForename() + " " + teacher.getSurename() + "\n");
            writer.write("Seznam studentů: \n");
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i).getStudentID() + ", " + list.get(i).getForename()
                        + " " + list.get(i).getSurename() + list.get(i).getYearOfBirth()
                        + " - " + nameOfClassroom);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
