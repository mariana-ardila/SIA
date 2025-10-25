package com.Proyecto_Integrador_SIA.Users.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Proyecto_Integrador_SIA.Users.Models.Student;
import com.Proyecto_Integrador_SIA.Users.UseCase.StudentUseCase;

@RestController
@RequestMapping("/estudiante")
public class StudentController {
    private final List<Student> estudiantes = new ArrayList<>();
    private final StudentUseCase useCase = new StudentUseCase();

    // Crear nuevo estudiante
    @PostMapping("/registrar")
    public String registrarEstudiante(@RequestBody Student estudiante) {
        estudiantes.add(estudiante);
        return "Estudiante registrado: " + estudiante.getName();
    }

    // Ver calificaciones por materia
    @GetMapping("/verCalificaciones")
    public String verCalificaciones(@RequestParam String email) {
        for (Student e : estudiantes) {
            if (e.getEmail().equals(email)) {
                return useCase.verCalificaciones(e);
            }
        }
        return "Estudiante no encontrado.";
    }

    // Consultar asistencia por clase
    @GetMapping("/consultarAsistencia")
    public String consultarAsistencia(@RequestParam String email) {
        for (Student e : estudiantes) {
            if (e.getEmail().equals(email)) {
                return useCase.consultarAsistencia(e);
            }
        }
        return "Estudiante no encontrado.";
    }

    // Ver materias inscritas
    @GetMapping("/materiasInscritas")
    public String verMaterias(@RequestParam String email) {
        for (Student e : estudiantes) {
            if (e.getEmail().equals(email)) {
                return useCase.verMateriasInscritas(e);
            }
        }
        return "Estudiante no encontrado.";
    }

    // Actualizar datos personales
    @PutMapping("/actualizarDatos")
    public String actualizarDatos(@RequestParam String email,@RequestParam String nuevoNombre,@RequestParam String nuevoEmail) {
        for (Student e : estudiantes) {
            if (e.getEmail().equals(email)) {
                return useCase.actualizarDatosPersonales(e, nuevoNombre, nuevoEmail);
            }
        }
        return "Estudiante no encontrado.";
    }
}
