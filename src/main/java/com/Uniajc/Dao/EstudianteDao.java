package com.Uniajc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.Uniajc.config.ConexionPostgresDatabase;
import com.Uniajc.Modelo.Estudiantes;

public class EstudianteDao {
   

    public void guardar(Estudiantes estudiante) {
               
        String sql = "INSERT INTO \"practica-mvc\".estudiantes (Name, Lastname, Email) VALUES (?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
                
            pstmt.setString(1, estudiante.getName());
            pstmt.setString(2, estudiante.getLastName());
            pstmt.setString(3, estudiante.getEmail());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Estudiantes> obtenerTodos() {
        List<Estudiantes> estudiantes = new ArrayList<>();

        String sql = "SELECT id, name, lastname, email FROM \"practica-mvc\".estudiantes";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setId(rs.getInt("id"));
                estudiante.setName(rs.getString("name"));
                estudiante.setLastName(rs.getString("lastname"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }

    
}
