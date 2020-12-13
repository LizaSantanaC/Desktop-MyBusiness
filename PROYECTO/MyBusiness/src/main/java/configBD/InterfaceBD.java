package configBD;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author liza
 */
public class InterfaceBD {
    private boolean conectado = false;
    private Connection conexion;
    private Statement stm; //Lo mejor es utilizar PREPARED STATMENT
    private ResultSet rs;
    private String url = "jdbc:mysql://192.168.2.19:3306/consultorio";
    private String user = "liza";
    private String password ="liza";

   //Constructor
   public InterfaceBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            
            System.out.println("CONEXION ESTABLECIDA");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//CONSTRUCTOR
    
    
   //Getters

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
   
   public Connection getConexion(){
       return conexion;
   }
   
   
    public boolean ejecutarInstruccionSQL(String sql){
        boolean res = true;
            
        try {
            stm = conexion.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    
    public ResultSet ejecutarConsulta(String sql){
        
        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
