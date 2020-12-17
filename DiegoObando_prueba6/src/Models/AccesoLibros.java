
package Models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoLibros extends ConexionBiblioteca {
    
    private ResultSet resultado;

    public AccesoLibros() {
        super.conectar();
    }
    
    //metodo CRUD - Read
    public ResultSet listar(){
        try {
            super.getStmt();
            resultado = stmt.executeQuery("Select * from libro");
        } catch (SQLException ex) {
            Logger.getLogger(AccesoLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    //metodo CRUD - Create
    public void ingresar(int idLibro, String nombreLibro, String autorLibro, String editorial, int ejemplares, int categoria_id){
        try {
            super.getStmt();
            stmt.executeUpdate("Insert into libro  (idLibro, nombreLibro, autorLibro, editorial, ejemplares, categoria_id) "
                    + "values ("+idLibro+",'"+nombreLibro+"','"+autorLibro+"','"+editorial+"',"+ejemplares+","+categoria_id+")");
            System.out.println("Ingresado con exito!");
            
        } catch (SQLException ex) {
            System.out.println("error al ingresar!");
            Logger.getLogger(AccesoLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Update
    public void actualizar(int idLibro, String nombreLibro, String autorLibro, String editorial, int ejemplares, int categoria_id){
        try {
            super.getStmt();
            stmt.executeUpdate("Update libro set "
                   
                    + "nombreLibro='"+nombreLibro+"',"
                    + "autorLibro='"+autorLibro+"',"
                    + "editorial='"+editorial+"',"
                    + "ejemplares="+ejemplares+","
                    + "categoria_id="+categoria_id+" "         
                    + " where idLibro="+idLibro);
            System.out.println("Actualizado con exito!");
        } catch (SQLException ex) {
            System.out.println("error al actualizar!");
            Logger.getLogger(AccesoLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo CRUD - Delete
    public void eliminar(int idLibro){
        try {
            super.getStmt();
            stmt.executeUpdate("Delete from libro where idLibro="+idLibro+"");
            System.out.println("Eliminado con exito!");
        } catch (SQLException ex) {
            System.out.println("error al eliminar!");
            Logger.getLogger(AccesoLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo busqueda por existencia
    public ResultSet existencia(int idLibro){
        try {
            super.getStmt();
            resultado = stmt.executeQuery("Select * from libros where idLibros="+idLibro);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
}
