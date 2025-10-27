package com.Proyecto_Integrador_SIA.Teacher.Models;

public class Course {
    private int idCourse;
    private String idTeacher;


public Course(int idCourse, String idTeacher){
this.idCourse=idCourse;
this.idTeacher=idTeacher;

}


public int getIdCourse() {
    return idCourse;
}


public void setIdCourse(int idCourse) {
    this.idCourse = idCourse;
}


public String getIdTeacher() {
    return idTeacher;
}


public void setIdTeacher(String idTeacher) {
    this.idTeacher = idTeacher;
}


}


