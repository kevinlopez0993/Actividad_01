/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    private String USERNAME ="root";
    private String PASSWORD ="";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "loginjsp";
    private String CLASSNAME ="com.mysql.jdbc.Driver";    
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;

    public Conexion() {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR" +e);
        } catch(SQLException e){
            System.err.println("ERROR" +e);
        }
    }
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args){
        Conexion con = new Conexion(); 
    }
    
}
