
package Models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBiblioteca {
    
    protected Connection con;
    protected Statement stmt;
    private final String url = "localhost";
    private final String dbms = "mysql";
    private final String port = "3306";
    private final String database = "biblioteca";
    private final String username = "admin";
    private final String password = "admin";

    public ConexionBiblioteca() {
        
    }
    
    public Connection conectar(){
        try {
            con = DriverManager.getConnection("jdbc:"+dbms+"://"+url+":"+port+"/"+database,username,password);
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public Statement getStmt() {
        return stmt;
    }
    
    public void Desconectar(){
        try {
            con.close();
            stmt.close();
            System.out.println("desconectado con base de datos.");
        } catch (SQLException ex) {
            System.out.println("Error al desconectar base de datos.");
            Logger.getLogger(ConexionBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
