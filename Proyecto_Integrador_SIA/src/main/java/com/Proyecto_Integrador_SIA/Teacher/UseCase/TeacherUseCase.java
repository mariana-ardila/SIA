package com.Proyecto_Integrador_SIA.Teacher.UseCase;
import org.springframework.stereotype.Service;
// ... (resto de imports y código que ya tienes)

import java.util.ArrayList;
import java.util.List;
import com.Proyecto_Integrador_SIA.Teacher.Models.Activity;
import com.Proyecto_Integrador_SIA.Teacher.Models.Notes;
import com.Proyecto_Integrador_SIA.Teacher.Models.AsistenciaStudents;


@Service
public class TeacherUseCase {

    private List<Activity> activities = new ArrayList<>();
    private List<Notes> notes = new ArrayList<>();
    private List<AsistenciaStudents> asistencias = new ArrayList<>();

    // =========================================================
    //  SECCIÓN DE ACTIVIDADES
    // =========================================================
    public void createActivity(int idActivity, int idCourse, String nameActivity) {
        Activity activity = new Activity(idActivity, idCourse, nameActivity);
        activity.setIdActivity(idActivity);
        activity.setIdCourse(idCourse);
        activity.setNameActivity(nameActivity);

        activities.add(activity);
        System.out.println(" Actividad creada: " + nameActivity);
    }

    public void updateActivity(int idActivity, String newName) {
        for (Activity activity : activities) {
            if (activity.getIdActivity() == idActivity) {
                activity.setNameActivity(newName);
                System.out.println(" Actividad actualizada: " + newName);
                return;
            }
        }
        System.out.println(" No se encontró la actividad con ID " + idActivity);
    }

    public void deleteActivity(int idActivity) {
        activities.removeIf(activity -> activity.getIdActivity() == idActivity);
        System.out.println(" Actividad eliminada con ID: " + idActivity);
    }

    public void showAllActivities() {
        System.out.println(" Lista de actividades:");
        for (Activity a : activities) {
            System.out.println("ID: " + a.getIdActivity() + " | Nombre: " + a.getNameActivity());
        }
    }

    // SECCIÓN DE NOTAS

    public void addNote(int idNote, int idStudent, int idActivity, int valueNote) {
        Notes note = new Notes(idNote, idStudent, idActivity, valueNote);
        note.setIdNote(idNote);
        note.setIdStudent(idStudent);
        note.setIdActivity(idActivity);
        note.setValueNote(valueNote);

        notes.add(note);
        System.out.println(" Nota agregada para estudiante " + idStudent);
    }

    public void updateNote(int idNote, int newValue) {
        for (Notes note : notes) {
            if (note.getIdNote() == idNote) {
                note.setValueNote(newValue);
                System.out.println(" Nota actualizada: " + newValue);
                return;
            }
        }
        System.out.println(" No se encontró la nota con ID " + idNote);
    }

    public void deleteNote(int idNote) {
        notes.removeIf(note -> note.getIdNote() == idNote);
        System.out.println(" Nota eliminada con ID: " + idNote);
    }

    public void showAllNotes() {
        System.out.println(" Notas registradas:");
        for (Notes n : notes) {
            System.out.println("ID Nota: " + n.getIdNote() + " | Estudiante: " + n.getIdStudent() +
                               " | Actividad: " + n.getIdActivity() + " | Valor: " + n.getValueNote());
        }
    }



   /*  public Asistencia(int idAttendance, int idStudent, boolean state) {
        this.idAttendance = idAttendance;
        this.idStudent = idStudent;
        this.state = state;
    }
 */ 
    // SECCIÓN DE ASISTENCIAS

     public void registerAttendance(int idAttendance, int idStudent, boolean state) {
        AsistenciaStudents asistencia = new AsistenciaStudents(idStudent, idStudent, state);
        asistencias.add(asistencia);
        System.out.println("Asistencia registrada para estudiante " + idStudent);
    }

    public void updateAttendance(int idAttendance, boolean state) {
        for (AsistenciaStudents asistencia : asistencias) {
            if (asistencia.getIdAttendance() == idAttendance) {
                asistencia.setState(state);
                System.out.println("Asistencia actualizada a " + (state ? "Presente" : "Ausente"));
                return;
            }
        }
        System.out.println("No se encontró la asistencia con ID " + idAttendance);
    }

    public void deleteAttendance(int idAttendance) {
        asistencias.removeIf(a -> a.getIdAttendance() == idAttendance);
        System.out.println("Asistencia eliminada con ID: " + idAttendance);
    }

    public void showAllAttendance() {
        if (asistencias.isEmpty()) {
            System.out.println("No hay asistencias registradas.");
            return;
        }
        System.out.println("Lista de asistencias:");
        for (AsistenciaStudents a : asistencias) {
            System.out.println("ID: " + a.getIdAttendance()
                + " | Estudiante: " + a.getIdStudent()
                + " | Estado: " + (a.isState() ? "Presente" : "Ausente"));
        }
    }
}