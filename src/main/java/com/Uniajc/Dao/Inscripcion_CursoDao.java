package com.Uniajc.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Uniajc.Modelo.Inscripcion_Curso;
import com.Uniajc.config.ConexionPostgresDatabase;
public class Inscripcion_CursoDao {
    
    public void guardar(Inscripcion_Curso inscripcion) {
        String sql = "INSERT INTO \"Practica-MVC\".\"Inscripcion_Curso\" " +
                     "(id_estudiante, id_grupo, nota_final, estado) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, inscripcion.getId_estudiante());
            pstmt.setInt(2, inscripcion.getId_grupo());
            pstmt.setFloat(3, inscripcion.getNota_final());
            pstmt.setString(4, inscripcion.getEstado());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Inscripcion_Curso> obtenerTodos() {
        List<Inscripcion_Curso> lista = new ArrayList<>();
        String sql = "SELECT id_inscripcion, id_estudiante, id_grupo, nota_final, estado " +
                     "FROM \"Practica-MVC\".\"Inscripcion_Curso\"";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Inscripcion_Curso ic = new Inscripcion_Curso(
                    rs.getString("estado"),
                    rs.getInt("id_estudiante"),
                    rs.getInt("id_grupo"),
                    rs.getInt("id_inscripcion"),
                    rs.getFloat("nota_final")
                );
                lista.add(ic);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
