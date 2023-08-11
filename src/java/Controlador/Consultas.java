package Controlador;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;


public class Consultas extends Conexion{
    //metodo de autenticacion
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from usuarios where usuario = ? and pass = ?";
            pst = (PreparedStatement) getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
            return true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        
        return false;
    }
    //metodo registrar
    public boolean registrar(String nombre, String apellido,String edad, String sexo, String usuario, String contraseña){
       
        PreparedStatement pst = null;
        try {
            String consulta = "Insert into usuarios(nombre, apellido, edad, sexo, usuario, pass) values(?,?,?,?,?,?)";
            pst = (PreparedStatement) getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, edad);
            pst.setString(4, sexo);
            pst.setString(5, usuario);
            pst.setString(6, contraseña);
            
            if(pst.executeUpdate() == 1){
               return true;
            }
            
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst !=null) pst.close();
            }catch(Exception e){
                System.err.println("Error" + e);
            }    
        }
        
        return false;
    }
    

}
