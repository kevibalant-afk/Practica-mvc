package com.Uniajc.Controlador;
import java.util.List;
import com.Uniajc.Modelo.Grupo;
import com.Uniajc.Servicios.GrupoService;
import com.Uniajc.Vista.VistaGrupo;

public class ControladorGrupo {
    private VistaGrupo vistaGrupo;
    private GrupoService grupoService;

    public ControladorGrupo(VistaGrupo vistaGrupo, GrupoService grupoService) {
        this.vistaGrupo = vistaGrupo;
        this.grupoService = grupoService;
    }

    public void registrarGrupo() {
        try {
            Grupo grupo = vistaGrupo.solicitarDatosGrupo();
            grupoService.registrarGrupo(grupo);
            System.out.println("Grupo registrado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarGrupos() {
        List<Grupo> grupos = grupoService.obtenerGrupos();
        vistaGrupo.mostrarGrupo(grupos);
    }
    
}
