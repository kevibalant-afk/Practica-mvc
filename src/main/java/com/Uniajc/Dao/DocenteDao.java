package com.Uniajc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.Uniajc.config.ConexionPostgresDatabase;
import com.Uniajc.Modelo.Docente;
public class DocenteDao {

    public void guardar(Docente docente) {
               
        String sql = "INSERT INTO \"Practica-MVC\".\"Docentes\" (\"Name\", \"LastName\", \"Specialty\") VALUES (?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Establecer los parámetros del PreparedStatement con los datos del docente
            pstmt.setString(1, docente.getName());
            pstmt.setString(2, docente.getLastName());
            pstmt.setString(3, docente.getSpecialty());

            // Ejecutar la consulta para insertar el docente en la base de datos
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Docente> obtenerTodos() {
        List<Docente> docentes = new ArrayList<>();

        String sql = "SELECT \"id\", \"Name\", \"LastName\", \"Specialty\" FROM \"Practica-MVC\".\"Docentes\"";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Docente docente = new Docente();
                docente.setId(rs.getInt("id"));
                docente.setName(rs.getString("Name"));
                docente.setLastName(rs.getString("LastName"));
                docente.setSpecialty(rs.getString("Specialty"));
                docentes.add(docente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docentes;
    }

}
