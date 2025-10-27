package com.Proyecto_Integrador_SIA.Teacher.Models;

public class AsistenciaStudents {
    private int idAttendance;
    private int idStudent;
    private boolean state;


    // ✅ Constructor con parámetros
    public AsistenciaStudents(int idAttendance, int idStudent, boolean state) {
        this.idAttendance = idAttendance;
        this.idStudent = idStudent;
        this.state = state;
    }

    public int getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(int idAttendance) {
        this.idAttendance = idAttendance;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
