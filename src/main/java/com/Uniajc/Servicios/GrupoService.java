package com.Uniajc.Servicios;

import java.util.List;
import com.Uniajc.Dao.GrupoDao;
import com.Uniajc.Modelo.Grupo;

public class GrupoService {
    private GrupoDao grupoDao;

    public GrupoService() {
        this.grupoDao = new GrupoDao();
    }

    public void registrarGrupo(Grupo grupo) {

        if (grupo.getNameGroup() == null || ((List<Grupo>) grupo.getNameGroup()).isEmpty()) {
            throw new IllegalArgumentException("El nombre del grupo es obligatorio.");
        }

        grupoDao.guardar(grupo);
    }

    public List<Grupo> obtenerGrupos() {
        return grupoDao.obtenerTodos();
    }


    
}