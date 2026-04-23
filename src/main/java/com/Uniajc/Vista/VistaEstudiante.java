package com.Uniajc.Vista;

import java.util.List;
import java.util.Scanner;

import com.Uniajc.Modelo.Estudiantes;

public class VistaEstudiante {

    private Scanner scanner;

    public VistaEstudiante() {
        this.scanner = new Scanner(System.in);
    }

    public Estudiantes solicitarDatosEstudiantes() {
       

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la correo del estudiante:");
        String correo = scanner.nextLine();

        return new Estudiantes(0, nombre, apellido, correo); 
    }

    public void mostrarDetallesEstudiante(Estudiantes estudiante) {
        System.out.println("ID: " + estudiante.getId() + ", Nombre: " + estudiante.getName() + ", Apellido: " + estudiante.getLastName() + ", Correo: " + estudiante.getEmail());
    }

    public void mostrarTodosLosEstudiantes(List<Estudiantes> estudiantes) {
        System.out.println("------");
        System.out.println("Lista de Estudiantes:");
        System.out.println("------");
        for (Estudiantes estudiante : estudiantes) {
            mostrarDetallesEstudiante(estudiante);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}

