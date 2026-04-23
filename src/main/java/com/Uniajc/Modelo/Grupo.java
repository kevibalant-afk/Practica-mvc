package com.Uniajc.Modelo;
import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private int id;
    private String aula;
    private String horario;

    // 🔥 RELACIONES IMPORTANTES
    private Docente docente;
    private Materia materia;

    // Un grupo tiene muchas inscripciones
    private List<InscripcionCurso> inscripciones;

    public Grupo() {
        this.inscripciones = new ArrayList<>();
    }

    // getters y setters...
}