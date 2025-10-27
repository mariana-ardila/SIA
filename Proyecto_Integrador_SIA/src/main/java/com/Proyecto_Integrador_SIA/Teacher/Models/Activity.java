package com.Proyecto_Integrador_SIA.Teacher.Models;

public class Activity {
    private int idActivity;
    private int idCourse;
    private String nameActivity;

public Activity() {
    }

public Activity(int idActivity, int idCourse, String nameActivity){
    this.idActivity=idActivity;
    this.idCourse=idCourse;
    this.nameActivity=nameActivity;
}

public int getIdActivity() {
    return idActivity;
}

public void setIdActivity(int idActivity) {
    this.idActivity = idActivity;
}

public int getIdCourse() {
    return idCourse;
}

public void setIdCourse(int idCourse) {
    this.idCourse = idCourse;
}

public String getNameActivity() {
    return nameActivity;
}

public void setNameActivity(String nameActivity) {
    this.nameActivity = nameActivity;
}



}
