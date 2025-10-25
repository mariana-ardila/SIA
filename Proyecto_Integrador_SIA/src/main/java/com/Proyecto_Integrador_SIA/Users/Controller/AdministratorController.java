package com.Proyecto_Integrador_SIA.Users.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Proyecto_Integrador_SIA.Users.Models.Administrator;
import com.Proyecto_Integrador_SIA.Users.Models.User;
import com.Proyecto_Integrador_SIA.Users.UseCase.AdministratorUseCase;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
    private final Administrator admin = new Administrator("Administrador General", "admin@cesde.edu.co", null, null, null, null, null, null);
    private final AdministratorUseCase useCase = new AdministratorUseCase();
    private final List<User> usuarios = new ArrayList<>();

    @PostMapping("/registrarEstudiante")
    public String registrarEstudiante(@RequestBody User estudiante) {
        usuarios.add(estudiante);
        return useCase.registrarEstudiante(admin, estudiante);
    }

    @PostMapping("/registrarProfesor")
    public String registrarProfesor(@RequestBody User profesor) {
        usuarios.add(profesor);
        return useCase.registrarProfesor(admin, profesor);
    }

    @PostMapping("/registrarMateria")
    public String registrarMateria(@RequestParam String materia) {
        return useCase.registrarMateria(admin, materia);
    }

    @PostMapping("/asignarMateriaDocente")
    public String asignarMateriaDocente(@RequestParam String materia, @RequestBody User profesor) {
        return useCase.asignarMateriaDocente(admin, profesor, materia);
    }

    @PutMapping("/actualizarUsuario")
    public String actualizarUsuario(@RequestParam String email, @RequestParam String nuevoNombre) {
        for (User u : usuarios) {
            if (u.getEmail().equals(email)) {
                return useCase.actualizarUsuario(admin, u, nuevoNombre);
            }
        }
        return "Usuario no encontrado con el correo: " + email;
    }

    @DeleteMapping("/eliminarUsuario")
    public String eliminarUsuario(@RequestParam String email) {
        for (User u : usuarios) {
            if (u.getEmail().equals(email)) {
                usuarios.remove(u);
                return useCase.eliminarUsuario(admin, u);
            }
        }
        return "No se encontró el usuario a eliminar.";
    }

    @GetMapping("/listarUsuarios")
    public String listarUsuarios() {
        return useCase.listarUsuarios(usuarios);
    }
}
