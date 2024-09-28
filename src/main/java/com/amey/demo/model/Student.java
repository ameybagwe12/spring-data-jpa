package com.amey.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// STUDENT CLASS FOR STUDENT TABLE

@Component
@Scope("prototype") // SINCE WE ARE WORKING WITH MULTIPLE STUDENTS
@Entity // FOR TABLE CREATION
public class Student {
    @Id // FOR ASSIGNING ROLL NO AS P_KEY
    private int rollNo;
    private String name;
    private int marks;

    // ADDED GETTERS AND SETTERS AND TOSTRING METHODS
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
