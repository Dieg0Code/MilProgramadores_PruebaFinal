
package Models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoCategorias extends ConexionBiblioteca {
    
    private ResultSet resultado;

    public AccesoCategorias() {
        super.conectar();
    }
    
    //metodo CRUD - Read
    public ResultSet listar(){
        try {
            super.getStmt();
            resultado = stmt.executeQuery("Select * from categoria");
        } catch (SQLException ex) {
            Logger.getLogger(AccesoCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    //metodo CRUD - Create
    public void ingresar(int idCategoria, String nombreCategoria, String descripcionCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Insert into categoria (idCategoria, nombreCategoria, descripcionCategoria) "
                    + "values ("+idCategoria+",'"+nombreCategoria+"','"+descripcionCategoria+"')");
            System.out.println("Ingresado con exito!");
            
        } catch (SQLException ex) {
            System.out.println("error al ingresar!");
            Logger.getLogger(AccesoCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Update
    public void actualizar(int idCategoria, String nombreCategoria, String descripcionCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Update categoria set "
                    + "nombreCategoria='"+nombreCategoria+"',"
                    + "descripcionCategoria='"+descripcionCategoria+"'"
                    +" where idCategoria="+idCategoria);       
                    
            System.out.println("Actualizado con exito!");
        } catch (SQLException ex) {
            System.out.println("error al actualizar!");
            Logger.getLogger(AccesoCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Delete
    public void eliminar(int idCategoria){
        try {
            super.getStmt();
            stmt.executeUpdate("Delete from categoria where idCategoria="+idCategoria+"");
            System.out.println("Eliminado con exito!");
        } catch (SQLException ex) {
            System.out.println("error al eliminar!");
            Logger.getLogger(AccesoCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo busqueda por existencia
    public ResultSet existencia(int idCategoria){
        try {
            super.getStmt();
            resultado = stmt.executeQuery("Select * from categoria where idCategoria="+idCategoria);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
}
