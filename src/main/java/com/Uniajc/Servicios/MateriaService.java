package com.Uniajc.Servicios;


import java.util.List;
import com.Uniajc.Dao.MateriaDao;
import com.Uniajc.Modelo.Materia;

public class MateriaService {

    private MateriaDao materiaDao;

    public MateriaService() {
        this.materiaDao = new MateriaDao();
    }

    public void registrarMateria(Materia materia) {

        if (materia.getNameMatery() == null || materia.getNameMatery().isEmpty() ||
            materia.getCredits() <= 0) {

            throw new IllegalArgumentException("Nombre y créditos válidos son obligatorios.");
        }

        materiaDao.guardar(materia);
    }

    public List<Materia> obtenerMaterias() {
        return materiaDao.obtenerTodos();
    }
}