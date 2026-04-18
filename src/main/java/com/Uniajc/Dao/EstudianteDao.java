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
               
        String sql = "INSERT INTO \"Practica-MVC\". \"Estudiantes\" (\"Name\", \"LastName\", \"Email\") VALUES (?, ?, ?)";

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
        

        String sql = "SELECT id, \"Name\", \"LastName\", \"Email\" FROM \"Practica-MVC\". \"Estudiantes\"";
        try (Connection conn = ConexionPostgresDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setId(rs.getInt("id"));
                estudiante.setName(rs.getString("Name"));
                estudiante.setLastName(rs.getString("LastName"));
                estudiante.setEmail(rs.getString("Email"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return estudiantes;
    }


    
}
