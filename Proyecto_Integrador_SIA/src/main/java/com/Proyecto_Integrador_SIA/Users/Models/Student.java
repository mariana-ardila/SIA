package com.Proyecto_Integrador_SIA.Users.Models;
import java.util.List;
import java.util.Map;

public class Student extends User {
    private Map<String, Double> calificaciones;
    private Map<String, Integer> asistencia;
    private List<String> materiasInscritas;

    public Student(String id, String name,  String email, String password, String cellphone, String profile,
    Map<String, Double> calificaciones, Map<String, Integer> asistencia, List<String> materiasInscritas){
        super(id, name, email, password, cellphone, profile);
        this.calificaciones = calificaciones;
        this.asistencia = asistencia;
        this.materiasInscritas = materiasInscritas;
    }

    public Map<String, Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<String, Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Map<String, Integer> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Map<String, Integer> asistencia) {
        this.asistencia = asistencia;
    }

    public List<String> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(List<String> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    
}
