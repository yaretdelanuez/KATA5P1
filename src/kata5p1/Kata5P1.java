/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Yar
 */
public class Kata5P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SelectApp app = new SelectApp();
        app.selectAll();
       // Cadena de conexión SQLite
        String url = "jdbc:sqlite:/C:/Users/Yar/Documents/NetBeansProjects/kata5P1/data/KATA5.db";
        // Instrucción SQL para crear nueva tabla
        String sql = "CREATE TABLE IF NOT EXISTS direcc_email (\n"
            + " id integer PRIMARY KEY AUTOINCREMENT,\n"
            + " Mail text NOT NULL);";
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
        // Se crea la nueva tabla
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    
    

}

