package com.Uniajc.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
     
    private int id_Estudiantes;
    private String Name;
    private String LastName;
    private String Email;

    private List<InscripcionCurso> inscripciones;

    public Estudiantes() {
        this.inscripciones = new ArrayList<>();
    }


    public Estudiantes(int id_Estudiantes, String Name, String LastName, String Email) {
        this.id_Estudiantes = id_Estudiantes;
        this.Name = Name;
        this.LastName = LastName;
        this.Email = Email;
    }

    public int getId() {
        return id_Estudiantes;
    }

    public void setId(int id_Estudiantes) {
        this.id_Estudiantes = id_Estudiantes;
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


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
