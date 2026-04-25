package com.Uniajc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    private int id_Docentes;
    private String Name;
    private String LastName;
    private String Specialty;

   private List<Grupo> grupos;

    public Docente() {
        this.grupos = new ArrayList<>();
    }

    public Docente(int id_Docentes, String Name, String LastName, String Specialty) {
        this.id_Docentes = id_Docentes;
        this.Name = Name;
        this.LastName = LastName;
        this.Specialty = Specialty;
        this.grupos = new ArrayList<>();
    }

    // 🔹 Getters y Setters

    public int getId() {
        return id_Docentes;
    }

    public void setId(int id_Docentes) {
        this.id_Docentes = id_Docentes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    // 🔥 MÉTODOS PARA MANEJAR GRUPOS

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void agregarGrupo(Grupo grupo) {
        this.grupos.add(grupo);
    }

    // 🔥 toString mejorado
    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id_Docentes +
                ", nombre='" + Name + " " + LastName + '\'' +
                ", especialidad='" + Specialty + '\'' +
                ", grupos=" + grupos +
                '}';
    }
}
