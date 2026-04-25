package com.Uniajc.Modelo;

public class InscripcionCurso {

    private int id;
    private float NoteFinal;
    private String State;

    // 🔥 RELACIONES
    private Estudiantes estudiante;
    private Grupo grupo;
    
    
    public InscripcionCurso( int id, float NoteFinal, String State, Estudiantes estudiante, Grupo grupo) {
        this.id = id;
        this.NoteFinal = NoteFinal;
        this.State = State;
        this.estudiante = estudiante;
        this.grupo = grupo;
           
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getNoteFinal() {
        return NoteFinal;
    }
    public void setNoteFinal(float NoteFinal) {
        this.NoteFinal = NoteFinal;
    }

    public String getState() {
        return State;
    }
    public void setState(String State) {
        this.State = State;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Grupo getGrupo() {
        return grupo;
    }
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}