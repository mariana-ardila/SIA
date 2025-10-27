package com.Proyecto_Integrador_SIA.Teacher.Models;

public class Teacher {
    private int teacherId;          
    private String firstName;
    private String lastName;
    private String email;        
    private String subjectArea;         

    public Teacher (int teacherId, String firstName, String lastName, String email,
    String subjectArea){

        this.teacherId=teacherId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.subjectArea=subjectArea;

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

}
