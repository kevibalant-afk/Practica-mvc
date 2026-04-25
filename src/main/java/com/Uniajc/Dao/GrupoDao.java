package com.Uniajc.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Uniajc.config.ConexionPostgresDatabase;
import com.Uniajc.Modelo.Grupo;

public class GrupoDao {

    public void guardar(Grupo grupo) {
        String sql = "INSERT INTO \"Practica-MVC\".\"Cursos\" (\"Aula\", \"Horario\", \"id_Docentes\", \"id_Materias\") VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, grupo.getAula());
            pstmt.setString(2, grupo.getHorario());
            pstmt.setInt(3, grupo.getDocente().getId()); // Asumiendo que el docente tiene un método getId_Docentes()
            pstmt.setInt(4, grupo.getMateria().getId()); // Asumiendo que la materia tiene un método getId_Materias()

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private Connection connection;

    public GrupoDao() {
        this.connection = ConexionPostgresDatabase.getConnection();
    }

    
    public List<Grupo> obtenerTodos() {
        List<Grupo> grupos = new ArrayList<>();

        String sql = "SELECT id_Grupo, Aula, Horario FROM \"Practica-MVC\".\"Cursos\"";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Grupo grupo = new Grupo();
                grupo.setId(rs.getInt("id_Grupo"));
                grupo.setAula(rs.getString("Aula"));
                grupo.setHorario(rs.getString("Horario"));
                grupos.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grupos;
    }
    
}
