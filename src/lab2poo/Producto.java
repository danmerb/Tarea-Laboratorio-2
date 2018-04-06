/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2poo;

/**
 *
 * @author Jeniffer Merino
 */
public class Producto {

    private String nombre;
    private int cantidad;
    private float precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;

    }
    //nombre 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //cantidad
    public int getCantiad() {
        return cantidad;

    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // precio
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
