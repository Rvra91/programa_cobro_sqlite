/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

/**
 *
 * @author Ramon
 */
public class Singlenton {
  
    private static Singlenton instancia;
    private String miVariable;

    private Singlenton() {
    }

    public static Singlenton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singlenton();
        }
        return instancia;
    }

    public String getMiVariable() {
        return miVariable;
    }

    public void setMiVariable(String valor) {
        miVariable = valor;
    }
}


