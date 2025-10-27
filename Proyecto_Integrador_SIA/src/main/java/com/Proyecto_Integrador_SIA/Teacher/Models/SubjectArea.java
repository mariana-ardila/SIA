package com.Proyecto_Integrador_SIA.Teacher.Models;

public class SubjectArea {
    private int idSubjectArea;
    private String nameSubjectArea;

    public SubjectArea(int idSubjectArea, String nameSubjectArea){
        this.idSubjectArea=idSubjectArea;
        this.nameSubjectArea=nameSubjectArea;
    }

    public int getIdSubjectArea() {
        return idSubjectArea;
    }

    public void setIdSubjectArea(int idSubjectArea) {
        this.idSubjectArea = idSubjectArea;
    }

    public String getNameSubjectArea() {
        return nameSubjectArea;
    }

    public void setNameSubjectArea(String nameSubjectArea) {
        this.nameSubjectArea = nameSubjectArea;
    }

    
    

    
}
