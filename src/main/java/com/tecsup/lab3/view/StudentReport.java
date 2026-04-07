package com.tecsup.lab3.view;

import com.tecsup.lab3.model.Student;

public class StudentReport {

    public void printStudent(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getName());
    }
}