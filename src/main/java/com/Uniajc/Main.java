package com.Uniajc;


import com.Uniajc.Controlador.ControladorEstudiante;
import com.Uniajc.Servicios.EstudianteService;
import com.Uniajc.Vista.VistaEstudiante;
public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC");
       

        VistaEstudiante vista = new VistaEstudiante();
        EstudianteService estudianteService = new EstudianteService();

      
        ControladorEstudiante controlador = new ControladorEstudiante(vista, estudianteService);

      controlador.mostrarTodosLosEstudiantes();

    controlador.registrarEstudiante(); 

        controlador.mostrarTodosLosEstudiantes(); 
    }
}
