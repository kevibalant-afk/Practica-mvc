package com.Uniajc.Controlador;

import java.util.List;
import com.Uniajc.Modelo.Materia;
import com.Uniajc.Servicios.MateriaService;
import com.Uniajc.Vista.VistaMateria;

public class ControladorMateria {

    private VistaMateria vistaMateria;
    private MateriaService materiaService;

    public ControladorMateria(VistaMateria vistaMateria, MateriaService materiaService) {
        this.vistaMateria = vistaMateria;
        this.materiaService = materiaService;
    }

    public void registrarMateria() {
        try {
            Materia materia = vistaMateria.solicitarDatosMateria();
            materiaService.registrarMateria(materia);
            System.out.println("Materia registrada exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarMaterias() {
        List<Materia> materias = materiaService.obtenerMaterias();
        vistaMateria.mostrarMaterias(materias);
    }
}