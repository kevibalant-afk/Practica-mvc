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
            
            // Establecer los parámetros del PreparedStatement con los datos del estudiante
            pstmt.setString(1, estudiante.getNombre());
            pstmt.setString(2, estudiante.getApellido());
            pstmt.setString(3, estudiante.getEmail());

            // Ejecutar la consulta para insertar el estudiante en la base de datos
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
                estudiante.setNombre(rs.getString("name"));
                estudiante.setApellido(rs.getString("lastname"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estudiantes;
    }

    
}
