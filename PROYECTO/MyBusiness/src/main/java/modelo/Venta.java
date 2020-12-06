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
public class Venta {
    private int codigo;
    private String hora;
    private String fecha;
    private double total;
    private String cliente;
    private String producto;
    private int cantidadProducto;

    //Costructores
    public Venta(int codigo, String hora, String fecha, double total, String cliente, String producto, int cantidadProducto) {
        this.codigo = codigo;
        this.hora = hora;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }
    

    public Venta() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
