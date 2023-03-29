/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

/**
 *
 * @author edwin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author edwin
 */
public class Conexion {
    Connection conectar = null;
    
    String usuario = "postgres";
    String contrasenia = "oomars2401";
    String bd = "postgres";
    String ip = "localhost";
    String Puerto = "5432";
    
    String cadena ="jdbc:postgresql://"+ip+":"+Puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de Datos");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar ala base de datos, error: "+e.toString());
        }
        return conectar;
    }
}



