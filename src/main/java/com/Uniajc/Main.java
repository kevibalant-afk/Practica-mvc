package com.Uniajc;

import com.Uniajc.Controlador.ControladorDocente;
import com.Uniajc.Servicios.DocenteService;
import com.Uniajc.Vista.VistaDocente;
//import com.Uniajc.Controlador.ControladorEstudiante;
//import com.Uniajc.Servicios.EstudianteService;
//import com.Uniajc.Vista.VistaEstudiante;
public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC");

        VistaDocente vistaDocente = new VistaDocente();
        DocenteService docenteService = new DocenteService();  

        ControladorDocente controladorDocente = new ControladorDocente(vistaDocente, docenteService);
        controladorDocente.mostrarTodosLosDocentes();
        controladorDocente.registrarDocente();
        
  //      VistaEstudiante vistaEstudiante = new VistaEstudiante();
    //    EstudianteService estudianteService = new EstudianteService();

      
      //  ControladorEstudiante controlador = new ControladorEstudiante(vistaEstudiante, estudianteService);

  //    controlador.mostrarTodosLosEstudiantes();
//  controlador.registrarEstudiante(); 

    //    controlador.mostrarTodosLosEstudiantes(); 
    }
}
