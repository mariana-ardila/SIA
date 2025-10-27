package com.Proyecto_Integrador_SIA.Teacher.Controller;

import com.Proyecto_Integrador_SIA.Teacher.UseCase.TeacherUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherUseCase teacherUseCase;

    // =========================================================
    // 🔹 SECCIÓN DE ACTIVIDADES
    // =========================================================

    @PostMapping("/activity")
    public String createActivity(@RequestParam int idActivity,
                                 @RequestParam int idCourse,
                                 @RequestParam String nameActivity) {
        teacherUseCase.createActivity(idActivity, idCourse, nameActivity);
        return "Actividad creada correctamente: " + nameActivity;
    }

    @PutMapping("/activity/{idActivity}")
    public String updateActivity(@PathVariable int idActivity,
                                 @RequestParam String newName) {
        teacherUseCase.updateActivity(idActivity, newName);
        return "Actividad actualizada: " + newName;
    }

    @DeleteMapping("/activity/{idActivity}")
    public String deleteActivity(@PathVariable int idActivity) {
        teacherUseCase.deleteActivity(idActivity);
        return "Actividad eliminada con ID: " + idActivity;
    }

    @GetMapping("/activities")
    public String showAllActivities() {
        teacherUseCase.showAllActivities();
        return "Consulta de actividades completada (ver consola).";
    }

    // =========================================================
    // 🔹 SECCIÓN DE NOTAS
    // =========================================================

    @PostMapping("/note")
    public String addNote(@RequestParam int idNote,
                          @RequestParam int idStudent,
                          @RequestParam int idActivity,
                          @RequestParam int valueNote) {
        teacherUseCase.addNote(idNote, idStudent, idActivity, valueNote);
        return "Nota registrada para estudiante " + idStudent;
    }

    @PutMapping("/note/{idNote}")
    public String updateNote(@PathVariable int idNote,
                             @RequestParam int newValue) {
        teacherUseCase.updateNote(idNote, newValue);
        return "Nota actualizada: " + newValue;
    }

    @DeleteMapping("/note/{idNote}")
    public String deleteNote(@PathVariable int idNote) {
        teacherUseCase.deleteNote(idNote);
        return "Nota eliminada con ID: " + idNote;
    }

    @GetMapping("/notes")
    public String showAllNotes() {
        teacherUseCase.showAllNotes();
        return "Consulta de notas completada (ver consola).";
    }

    // =========================================================
    // 🔹 SECCIÓN DE ASISTENCIAS
    // =========================================================

    @PostMapping("/attendance")
    public String registerAttendance(@RequestParam int idAttendance,
                                     @RequestParam int idStudent,
                                     @RequestParam boolean state) {
        teacherUseCase.registerAttendance(idAttendance, idStudent, state);
        return "Asistencia registrada para estudiante " + idStudent;
    }

    @PutMapping("/attendance/{idAttendance}")
    public String updateAttendance(@PathVariable int idAttendance,
                                   @RequestParam boolean state) {
        teacherUseCase.updateAttendance(idAttendance, state);
        return "Asistencia actualizada para ID: " + idAttendance;
    }

    @DeleteMapping("/attendance/{idAttendance}")
    public String deleteAttendance(@PathVariable int idAttendance) {
        teacherUseCase.deleteAttendance(idAttendance);
        return "Asistencia eliminada con ID: " + idAttendance;
    }

    @GetMapping("/attendances")
    public String showAllAttendance() {
        teacherUseCase.showAllAttendance();
        return "Consulta de asistencias completada (ver consola).";
    }
}
