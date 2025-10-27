package com.Proyecto_Integrador_SIA.Teacher.Models;

public class Notes {
    private int idNote;
    private int idStudent;
    private int idActivity;
    private int valueNote;

    public Notes() {
    }

public Notes(int idNote, int idStudent, int idActivity, int valueNote){
this.idNote=idNote;
this.idStudent=idStudent;
this.idActivity=idActivity;
this.valueNote=valueNote;

}

public int getIdNote() {
    return idNote;
}

public void setIdNote(int idNote) {
    this.idNote = idNote;
}

public int getIdStudent() {
    return idStudent;
}

public void setIdStudent(int idStudent) {
    this.idStudent = idStudent;
}

public int getIdActivity() {
    return idActivity;
}

public void setIdActivity(int idActivity) {
    this.idActivity = idActivity;
}

public int getValueNote() {
    return valueNote;
}

public void setValueNote(int valueNote) {
    this.valueNote = valueNote;
}
    
}
