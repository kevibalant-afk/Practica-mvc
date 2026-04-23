package com.Uniajc.Vista;


import java.util.List;
import java.util.Scanner;
import com.Uniajc.Modelo.Docente;

public class VistaDocente {

private Scanner scanner;

    public VistaDocente() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarDocente(List<Docente> docente) {
        System.out.println("Lista de Docentes:");
        for (Docente docente : docente) {
            System.out.println("ID: " + docente.getId() + ", Nombre: " + docente.getName() + " " + docente.getLastName() + ", Especialidad: " + docente.getSpecialty());
        }
    }

    public Docente solicitarDatosDocente() {
        try (Scanner scanner = new Scanner(System.in)) {
            Docente docente = new Docente();

            System.out.print("Ingrese el nombre del docente: ");
            docente.setName(scanner.nextLine());

            System.out.print("Ingrese el apellido del docente: ");
            docente.setLastName(scanner.nextLine());

            System.out.print("Ingrese la especialidad del docente: ");
            docente.setSpecialty(scanner.nextLine());

            return docente;
        }
    }

   

}
