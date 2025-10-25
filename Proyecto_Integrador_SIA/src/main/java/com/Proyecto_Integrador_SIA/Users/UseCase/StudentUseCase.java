package com.Proyecto_Integrador_SIA.Users.UseCase;


import java.util.List;

import com.Proyecto_Integrador_SIA.Users.Models.Student;

public class StudentUseCase {
    public String verCalificaciones(Student estudiante) {
        if (estudiante.getCalificaciones().isEmpty()) {
            return "No hay calificaciones registradas.";
        }

        StringBuilder result = new StringBuilder("Calificaciones de " + estudiante.getName() + ":\n");
        estudiante.getCalificaciones().forEach((materia, nota) -> {
            result.append("- ").append(materia).append(": ").append(nota).append("\n");
        });
        return result.toString();
    }

    // Caso 2: Consultar asistencia por clase
    public String consultarAsistencia(Student estudiante) {
        if (estudiante.getAsistencia().isEmpty()) {
            return "No hay registros de asistencia.";
        }

        StringBuilder result = new StringBuilder("Asistencia de " + estudiante.getName() + ":\n");
        estudiante.getAsistencia().forEach((clase, estado) -> {
            result.append("- ").append(clase).append(": ").append(estado).append("\n");
        });
        return result.toString();
    }

    // Caso 3: Ver materias inscritas
    public String verMateriasInscritas(Student estudiante) {
        List<String> materias = estudiante.getMateriasInscritas();
        if (materias == null || materias.isEmpty()) {
            return "No hay materias inscritas.";
        }

        StringBuilder result = new StringBuilder("Materias inscritas:\n");
        materias.forEach(m -> result.append("- ").append(m).append("\n"));
        return result.toString();
    }

    // Caso 4: Actualizar datos personales
    public String actualizarDatosPersonales(Student estudiante, String nuevoNombre, String nuevoEmail) {
        estudiante.setName(nuevoNombre);
        estudiante.setEmail(nuevoEmail);
        return "Datos personales actualizados correctamente:\n" +
                "Nombre: " + nuevoNombre + "\nEmail: " + nuevoEmail;
    }
}
