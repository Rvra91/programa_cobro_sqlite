/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ramon
 */
public class Categoria {
    
    
    private int idCategoria;
    private String Descripcion;
    private int estado;
    
    public Categoria(){
        
        this.idCategoria = 0;
        this.Descripcion = "";
        this.estado = 0;
        
    }

    public Categoria(int idCategoria, String Descripcion, int estado) {
        this.idCategoria = idCategoria;
        this.Descripcion = Descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
