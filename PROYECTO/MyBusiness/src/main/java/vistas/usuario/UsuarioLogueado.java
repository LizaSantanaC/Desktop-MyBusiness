
package vista.usuario;

import modelo.Usuario;

/**
 *
 * @author liza
 */
public class UsuarioLogueado {
    
    private static UsuarioLogueado uLogueado;
    
    private String usuario;
    private String contraseña;
    private boolean isAdmin;
    
    private UsuarioLogueado(){}
    
    public synchronized static UsuarioLogueado getUsuario(){
        
        if(uLogueado == null){
            uLogueado = new UsuarioLogueado();
        }
        
        return uLogueado;
    }
    
    
    public void setUsuario(Usuario u) {
        usuario = u.getUsuario();
        contraseña = u.getContraseña();
        isAdmin = u.isIsAdmin();
    }

    public String getNombre() {
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
