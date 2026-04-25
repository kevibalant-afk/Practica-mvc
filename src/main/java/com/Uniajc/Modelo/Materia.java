package com.Uniajc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private int id_Materia;
    private String NameMatery;
    private int Credits;

    // Relación: una materia tiene muchos grupos
    private List<Grupo> grupos;

    public Materia() {
        this.grupos = new ArrayList<>();
    }

    // getters y setters...

    public Materia(int id_Materia, String nameMatery, int credits) {
        this.id_Materia = id_Materia;
        this.NameMatery = nameMatery;
        this.Credits = credits;
    }

    public int getId() {
        return id_Materia;
    }

    public void setId(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNameMatery() {
        return NameMatery;
    }

    public void setNameMatery(String nameMatery) {
        this.NameMatery = nameMatery;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        this.Credits = credits;
    }

    

}    