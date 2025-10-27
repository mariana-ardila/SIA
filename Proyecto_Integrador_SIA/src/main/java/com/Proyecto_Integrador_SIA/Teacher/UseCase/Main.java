package com.Proyecto_Integrador_SIA.Teacher.UseCase;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.Proyecto_Integrador_SIA.Teacher.Models.Activity;
import com.Proyecto_Integrador_SIA.Teacher.Models.Notes;
import com.Proyecto_Integrador_SIA.Teacher.Models.AsistenciaStudents;

public class Main {
    public static void main(String[] args) {
        
        TeacherUseCase profesorUno = new TeacherUseCase();

        profesorUno.createActivity(232, 434, "Exposición");
        profesorUno.createActivity(232, 434, "Taller");
        profesorUno.createActivity(322, 434, "Tarea");




    }
}
