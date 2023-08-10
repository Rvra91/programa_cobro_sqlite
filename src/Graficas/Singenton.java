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
public class Singenton {
    private static Singenton instancia;
    private String variable;

    private Singenton() {
        // Constructor privado para evitar la creación de instancias desde fuera de la clase
    }

    public static Singenton getInstancia() {
        if (instancia == null) {
            instancia = new Singenton();
        }
        return instancia;
    }

    public String getVariable() {
        return variable;
    }

    public String setVariable(String variable) {
        this.variable = variable;
            return variable;
    }
}

