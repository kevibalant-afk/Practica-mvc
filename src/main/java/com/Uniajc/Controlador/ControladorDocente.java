package com.Uniajc.Controlador;

import com.Uniajc.Modelo.Docente;
import com.Uniajc.Servicios.DocenteService;
import com.Uniajc.Vista.VistaDocente;

public class ControladorDocente {

    private VistaDocente vistaDocente;
    private DocenteService docenteService;

    public ControladorDocente(VistaDocente vistaDocente, DocenteService docenteService) {
        this.vistaDocente = vistaDocente;
        this.docenteService = docenteService;
    }

    public void mostrarTodosLosDocentes() {
        vistaDocente.mostrarDocentes(docenteService.obtenerTodosLosDocentes());
    }

    public void registrarDocente() {
        try {
            Docente nuevoDocente = vistaDocente.solicitarDatosDocente();
            docenteService.registrarDocente(nuevoDocente);
            System.out.println("Docente registrado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar el docente: " + e.getMessage());
        }
    }
}