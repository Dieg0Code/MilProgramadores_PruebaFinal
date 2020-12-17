/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author diego
 */
public class ComboBox {
    private int idCategoria;
    private String nombreCategoria;

    public ComboBox(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }
    
    public ComboBox(){
        
    }

    public int getId() {
        return idCategoria;
    }

    public String getNombre() {
        return nombreCategoria;
    }

    @Override
    public String toString() {
        return nombreCategoria;
    }
    
}
