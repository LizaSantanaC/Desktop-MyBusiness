/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author liza
 */
public class Producto {
    //Variables de intancia
    private String codigo;
    private String nombre;
    private String marca;
    private String proveedor;
    private int numAlmacen;
    private double precioCompra;
    private double precioVenta;

    //Constructores
    public Producto() {
    }   
    
    public Producto(String codigo, String nombre, String marca, String proveedor, int numAlmacen, double precioCompra, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.proveedor = proveedor;
        this.numAlmacen = numAlmacen;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumAlmacen() {
        return numAlmacen;
    }

    public void setNumAlmacen(int numAlmacen) {
        this.numAlmacen = numAlmacen;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
