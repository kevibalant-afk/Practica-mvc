package com.Uniajc.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Uniajc.config.ConexionPostgresDatabase;
import java.util.ArrayList;
import java.util.List;

import com.Uniajc.Modelo.Materia;

public class MateriaDao {

    private List<Materia> listaMaterias;

    public MateriaDao() {
        this.listaMaterias = new ArrayList<>();
    }

    // Guardar
    public void guardar(Materia materia) {
        String sql = "INSERT INTO \"Practica-MVC\".\"Materias\" (\"NameMatery\", \"Credits\") VALUES (?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, materia.getNameMatery());
            pstmt.setInt(2, materia.getCredits());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
      
    }
    public List<Materia> obtenerTodos() {
    List<Materia> materias = new ArrayList<>();

    String sql = "SELECT \"id_Materias\", \"NameMatery\", \"Credits\" FROM \"Practica-MVC\".\"Materias\"";

    try (Connection conn = ConexionPostgresDatabase.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        while (rs.next()) {
            Materia materia = new Materia();
            materia.setId(rs.getInt("id_Materias"));
            materia.setNameMatery(rs.getString("NameMatery"));
            materia.setCredits(rs.getInt("Credits"));
            materias.add(materia);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return materias;
}
}