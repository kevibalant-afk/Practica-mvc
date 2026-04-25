package com.Uniajc.Vista;

import java.util.List;
import java.util.Scanner;
import com.Uniajc.Modelo.Materia;

public class VistaMateria {

    private Scanner scanner;

    public VistaMateria() {
        this.scanner = new Scanner(System.in);
    }

    public Materia solicitarDatosMateria() {

        Materia materia = new Materia();

        System.out.print("Ingrese ID de la materia: ");
        materia.setId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Ingrese nombre de la materia: ");
        materia.setNameMatery(scanner.nextLine());

        System.out.print("Ingrese créditos: ");
        materia.setCredits(Integer.parseInt(scanner.nextLine()));

        return materia;
    }

    public void mostrarMaterias(List<Materia> materias) {

        System.out.println("Lista de Materias:");

        for (Materia m : materias) {
            System.out.println("ID: " + m.getId() +
                    ", Nombre: " + m.getNameMatery() +
                    ", Créditos: " + m.getCredits());
        }
    }
}
