package com.Uniajc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
     
    private int id;
    private String Name;
    private String LastName;
    private String Email;

    private List<InscripcionCurso> inscripciones;

    public Estudiantes() {
        this.inscripciones = new ArrayList<>();
    }


    public Estudiantes(int id, String Name, String LastName, String Email) {
        this.id = id;
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
    }

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

    public void setLastName(String aLastName) {
        this.LastName = aLastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
