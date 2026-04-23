package com.Uniajc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConexionPostgresDatabase {
    

    public static Connection getConnection() {
        // Usamos un objeto Properties para cargar los parámetros de conexión desde un archivo de configuración
        Properties properties = new Properties();
       
            try {
                // Cargar las propiedades desde el archivo config-postgres.properties
                properties.load(new FileInputStream(new File("config.properties")));

                // Definir los parámetros de conexión
                String url = properties.getProperty("db.url");
                System.out.println("URL de conexión: " + url); // Imprimir la URL para verificar que se está leyendo correctamente
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");
              

                // Establecer la conexión
                return DriverManager.getConnection(url, user, password);
                //System.out.println("Conexión a base de datos exitosa.");
            } catch (SQLException error) {
            System.out.println("Error de SQL: " + error.getMessage());
        } catch (IOException error) {
            error.printStackTrace();
        }
        return null;
    }
}
   

