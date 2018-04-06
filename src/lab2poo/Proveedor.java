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
public class Proveedor {

    private String nombre;
    private String producto;
    private String empresa;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(String nombre, String producto, String empresa, int telefono) {
        this.nombre = nombre;
        this.producto = producto;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    //nombre
    public String getNombre() {
        return nombre;
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }

    //producto
    public String getProducto() {
        return producto;
    }

    public void setProducto(String produto) {
        this.producto = producto;
    }

    //empresa
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;

    }

    //telefono
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
