
package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;

public class StudentController {

    public void showStudent(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getName());
    }
}