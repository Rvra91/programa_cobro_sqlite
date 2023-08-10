/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author Ramon
 */
public class Clientes {

    int idClientes;
    String nombre;
    String apellido;
    int prestamo;
    int plazo_dias;
    double intereses;
    int mora;
    int estado;
    int IdCategoria;
    int prestamo_restante;
    Date Fecha_vencimiento;
    int contador_estado;
    int contador_estado_paz;
String direccion;
String numero_celular;
int Valor_cuota;
int prestamo_intereses;
int orden;

    public Clientes() {
        idClientes = 0;
        nombre = "";
        apellido = "";
        plazo_dias = 0;
        IdCategoria = 0;
        intereses = 0;
numero_celular="";
direccion="";
        mora = 0;
        prestamo_restante = 0;
        estado = 0;
        Fecha_vencimiento = null;
        contador_estado = 0;
        contador_estado_paz = 0;
        Valor_cuota=0;
        prestamo_intereses=0;
        orden=0;
    }

    public Clientes(int idClientes, String nombre, String apellido, int prestamo, int plazo_dias, double intereses, int mora, int estado, int IdCategoria, int prestamo_restante, Date Fecha_vencimiento, int contador_estado, int contador_estado_paz, String numero_celular, String direccion, int Valor_cuota,int prestamo_intereses,int orden
) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamo = prestamo;
        this.plazo_dias = plazo_dias;
        this.intereses = intereses;
        this.mora = mora;
        this.estado = estado;
        this.IdCategoria = IdCategoria;
        this.prestamo_restante = prestamo_restante;
        this.Fecha_vencimiento = Fecha_vencimiento;
        this.contador_estado = contador_estado;
        this.contador_estado_paz = contador_estado_paz;
        this.numero_celular= numero_celular;
        this.direccion= direccion;
        this.Valor_cuota=Valor_cuota;
        this.prestamo_intereses=prestamo_intereses;
        this.orden=orden;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getValor_cuota() {
        return Valor_cuota;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getPrestamo_intereses() {
        return prestamo_intereses;
    }

    public void setPrestamo_intereses(int prestamo_intereses) {
        this.prestamo_intereses = prestamo_intereses;
    }

    public void setValor_cuota(int Valor_cuota) {
        this.Valor_cuota = Valor_cuota;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public int getContador_estado() {
        return contador_estado;
    }

    public void setContador_estado(int contador_estado) {
        this.contador_estado = contador_estado;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public Date getFecha_vencimiento() {
        return Fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date Fecha_vencimiento) {
        this.Fecha_vencimiento = Fecha_vencimiento;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public int getContador_estado_paz() {
        return contador_estado_paz;
    }

    public void setContador_estado_paz(int contador_estado_paz) {
        this.contador_estado_paz = contador_estado_paz;
    }

    public int getPrestamo_restante() {
        return prestamo_restante;
    }

    public void setPrestamo_restante(int prestamo_restante) {
        this.prestamo_restante = prestamo_restante;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public int getPlazo_dias() {
        return plazo_dias;
    }

    public void setPlazo_dias(int plazo_dias) {
        this.plazo_dias = plazo_dias;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public int getMora() {
        return mora;
    }

    public void setMora(int mora) {
        this.mora = mora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
