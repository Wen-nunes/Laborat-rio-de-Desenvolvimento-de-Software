/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BDAula01?useTimeZone=true&serverTimeZone=UTC",
                    "root", "laboratorio");
            System.out.println("Conectado com exito!!");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
