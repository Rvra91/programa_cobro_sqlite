/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

   public class zapato {
    private String ciudad;

    public zapato() {
        this.ciudad = ciudad;
    }

 

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
       public static void main(String[] args) {
        zapato z = new zapato();
           System.out.println(z.getCiudad());
       }
}
