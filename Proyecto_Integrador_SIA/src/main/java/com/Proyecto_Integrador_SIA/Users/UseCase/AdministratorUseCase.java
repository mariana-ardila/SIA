package com.Proyecto_Integrador_SIA.Users.UseCase;

import java.util.List;

import com.Proyecto_Integrador_SIA.Users.Models.Administrator;
import com.Proyecto_Integrador_SIA.Users.Models.User;

public class AdministratorUseCase {
    public String registrarEstudiante(Administrator admin, User estudiante) {
        return "Estudiante registrado: " + estudiante.getName();
    }

    public String registrarProfesor(Administrator admin, User profesor) {
        return "Profesor registrado: " + profesor.getName();
    }

    public String registrarMateria(Administrator admin, String materia) {
        return "Materia registrada: " + materia;
    }

    public String asignarMateriaDocente(Administrator admin, User profesor, String materia) {
        return "Materia '" + materia + "' asignada al profesor " + profesor.getName();
    }

    public String actualizarUsuario(Administrator admin, User usuario, String nuevoNombre) {
        usuario.setName(nuevoNombre);
        return "Usuario actualizado correctamente: " + nuevoNombre;
    }

    public String eliminarUsuario(Administrator admin, User usuario) {
        return "Usuario eliminado: " + usuario.getName();
    }

    public String listarUsuarios(List<User> usuarios) {
        if (usuarios == null || usuarios.isEmpty()) {
            return "No hay usuarios registrados.";
        }
        StringBuilder listado = new StringBuilder("📋 Lista de usuarios:\n");
        for (User u : usuarios) {
            listado.append("- ").append(u.getName()).append(" (").append(u.getEmail()).append(")\n");
        }
        return listado.toString();
    }
}
