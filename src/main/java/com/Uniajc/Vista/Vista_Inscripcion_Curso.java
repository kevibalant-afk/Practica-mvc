package com.Uniajc.Vista;


import java.util.List;
import java.util.Scanner;

import com.Uniajc.Modelo.Inscripcion_Curso;

public class Vista_Inscripcion_Curso {
    
    private Scanner scanner;

    public Vista_Inscripcion_Curso() {
        this.scanner = new Scanner(System.in);
    }

    public Inscripcion_Curso solicitarDatosInscripcion() {
        System.out.println("Ingrese el ID del estudiante:");
        int idEstudiante = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el ID del grupo:");
        int idGrupo = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la nota final (0.0 - 10.0):");
        float nota = Float.parseFloat(scanner.nextLine());

        String estado = nota >= 6 ? "APROBADO" : "REPROBADO";

        return new Inscripcion_Curso(estado, idEstudiante, idGrupo, 0, nota);
    }

    public void mostrarDetallesInscripcion(Inscripcion_Curso ic) {
        System.out.println(
            "ID: "           + ic.getId_inscripcion() +
            ", Estudiante: " + ic.getId_estudiante()  +
            ", Grupo: "      + ic.getId_grupo()        +
            ", Nota: "       + ic.getNota_final()      +
            ", Estado: "     + ic.getEstado()
        );
    }

    public void mostrarTodasLasInscripciones(List<Inscripcion_Curso> lista) {
        System.out.println("------");
        System.out.println("Lista de Inscripciones:");
        System.out.println("------");
        for (Inscripcion_Curso ic : lista) {
            mostrarDetallesInscripcion(ic);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
