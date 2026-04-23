package com.Uniajc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    private int id;
    private String Name;
    private String LastName;
    private String Specialty;

   private List<Grupo> grupos;

    public Docente() {
        this.grupos = new ArrayList<>();
    }

    public Docente(int id, String Name, String LastName, String Specialty) {
        this.id = id;
        this.Name = Name;
        this.LastName = LastName;
        this.Specialty = Specialty;
        this.grupos = new ArrayList<>();
    }

    // 🔹 Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", nombre='" + Name + " " + LastName + '\'' +
                ", especialidad='" + Specialty + '\'' +
                ", grupos=" + grupos +
                '}';
    }
}
