/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Ramon
 */
public class Categoria {

    int idcategoria;
    String ciudad;
    String tipo_deudor;

    public Categoria() {
        idcategoria = 0;
        ciudad = "";
        tipo_deudor = "";

    }

    public Categoria(int idcategoria, String ciudad, String tipo_deudor) {
        this.idcategoria = idcategoria;
        this.ciudad = ciudad;
        this.tipo_deudor = tipo_deudor;
    }

    public int getIdcategorias() {
        return idcategoria;
    }

    public void setIdcategorias(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo_deudor() {
        return tipo_deudor;
    }

    public void setTipo_deudor(String tipo_deudor) {
        this.tipo_deudor = tipo_deudor;
    }

}
