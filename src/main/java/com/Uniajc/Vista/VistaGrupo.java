package com.Uniajc.Vista;

import com.Uniajc.Modelo.Grupo;
import java.util.List;
import java.util.Scanner;


public class VistaGrupo {
    private Scanner scanner;

    public VistaGrupo() {
        this.scanner = new Scanner(System.in);
    }
    public Grupo solicitarDatosGrupo() {
        Grupo grupo = new Grupo();

        System.out.print("Ingrese ID del grupo: ");
        grupo.setId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Ingrese aula: ");
        grupo.setAula(scanner.nextLine());

        System.out.print("Ingrese horario: ");
        grupo.setHorario(scanner.nextLine());

        return grupo;
    }

    public void mostrarGrupo(List<Grupo> grupos) {
        System.out.println("Grupo ID: " + ((Grupo) grupos).getId());
        System.out.println("Materia: " + (((Grupo) grupos).getMateria() != null ? ((Grupo) grupos).getMateria().getNameMatery() : "N/A"));
        System.out.println("Docente: " + (((Grupo) grupos).getDocente() != null ? ((Grupo) grupos).getDocente().getName() + " " + ((Grupo) grupos).getDocente().getLastName() : "N/A"));
        System.out.println("Aula: " + ((Grupo) grupos).getAula());
        System.out.println("Horario: " + ((Grupo) grupos).getHorario());
    }
    
}