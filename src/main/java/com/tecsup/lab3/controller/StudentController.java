
package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;

public class StudentController {

	public void printUpperName(Student student) {
	    System.out.println("Nombre en mayúsculas: " + student.getName().toUpperCase());
	
    }
}