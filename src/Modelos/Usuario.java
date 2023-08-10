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
public class Usuario {

    int IdUser;
    String user;
    String password;
int estado;
    public Usuario() {
        IdUser = 0;
        user = "";
        password = "";
estado=0;
    }

    public Usuario(int IddUser, String user, String password, int estado) {
        this.IdUser = IddUser;
        this.user = user;
        this.password = password;
        this.estado = estado;
    }

    public int getIddUser() {
        return IdUser;
    }

    public void setIddUser(int IddUser) {
        this.IdUser = IdUser;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
