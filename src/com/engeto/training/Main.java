package com.engeto.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String OUTPUT_FILE = "vystup.txt";

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jan", "Novák");

        List<Student> list = new ArrayList<>();

        Student student1 = new Student("Petr", "Svoboda", 2011, "ID001");
        Student student2 = new Student("Milan", "Říha", 2010, "ID123");
        Student student3 = new Student("Jindřich", "Nový", 2012, "ID345");

        list.add(student1);
        list.add(student2);
        list.add(student3);

        Class classroom = new Class("4.C", 4, teacher, list);

        classroom.printClassroom();
        classroom.printStudents();
        classroom.printClassroomDetails();

        try {
            classroom.exportToTextFile(OUTPUT_FILE);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
