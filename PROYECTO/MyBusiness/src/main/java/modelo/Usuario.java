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
public class Usuario {
    private String usuario;
    private String contraseña;
    private boolean isAdmin;

    public Usuario() {
    }
    
    

    public Usuario(String usuario, String contraseña, boolean isAdmin) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.isAdmin = isAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
