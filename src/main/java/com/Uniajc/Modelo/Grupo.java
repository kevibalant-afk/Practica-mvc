package com.Uniajc.Modelo;
import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private int id_Grupo;
    private String Aula;
    private String Horario;

    // 🔥 RELACIONES IMPORTANTES
    private Docente docente;
    private Materia materia;

    // Un grupo tiene muchas inscripciones
    private List<InscripcionCurso> inscripciones;

    public Grupo() {
        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id_Grupo;
    }

    public void setId(int id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public Object getNameGroup() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNameGroup'");
    }

    
}