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
        // Aquí se podrían implementar métodos para solicitar al usuario que ingrese los datos del estudiante
        // Por ejemplo, utilizando Scanner para leer desde la consola o creando un formulario en una interfaz gráfica

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la correo del estudiante:");
        String correo = scanner.nextLine();

        return new Estudiantes(0, nombre, apellido, correo); // Retornar un objeto Estudiantes con los datos ingresados por el usuario
    }

    // La manera sencilla de mostrar los detalles de un estudiante es a través de un método que reciba un objeto Estudiante y acceda a sus propiedades para mostrarlas. Aquí te dejo un ejemplo de cómo podrías implementar esto:
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

