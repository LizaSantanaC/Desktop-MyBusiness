/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author liza
 */
public class CLIENTEDAO {
    import configBD.InterfaceBD;
import modelo.Cliente;
import modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    /*varaibles de instancia*/
    private InterfaceBD conexion;
    private String sql;

    /*Constructor*/
    public ClienteDAO() {
        conexion = new InterfaceBD();
    }
    
    
    public boolean registrarCliente(Cliente c) {

        sql = "INSERT INTO Clientes VALUES('"
                + c.getCurp().toUpperCase() + "','"
                + c.getNombre() + "','"
                + c.getPrimerAp() + "','"
                + c.getSegundoAp() + "','"
                + c.getDireccion() + "','"
                + c.getTelefono() + "','"
                + c.getNegocio() + "')";

        System.out.println(sql);
        return conexion.ejecutarInstruccionSQL(sql);
    }
    
    
    public boolean eliminarClinete(String curp) {
        sql = " DELETE FROM Clientes WHERE Curp ='" + curp.toUpperCase() + "'";
        return conexion.ejecutarInstruccionSQL(sql);
    }
    
    
    public Cliente consultaCliente(String curp){	 
		sql = " SELECT * FROM Clientes WHERE Curp ='"+curp.toUpperCase()+"'";	
		System.out.println(sql);             
		ResultSet rs = conexion.ejecutarConsulta(sql);
                
		if(rs == null){
			return null;
		}else{
			Cliente c = null;
			try {
				while (rs.next()) {
					c = new Cliente();
					c.setNombre(rs.getString(2));
					c.setPrimerAp(rs.getString(3));
					c.setSegundoAp(rs.getString(4));
					c.setDireccion(rs.getString(5));
					c.setTelefono(rs.getString(6));
					c.setNegocio(rs.getString(7));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return null;
			}
			return c;
		}	
	}
    
    public boolean modificacionCliente(Cliente c){	
		
        System.out.println("UPDATE Clientes SET Nombre ='"+
                        c.getNombre()+"',Primer_Ap ='"+
                        c.getPrimerAp()+"',Segundo_Ap ='"+
                        c.getSegundoAp()+"',Direccion ='"+
                        c.getDireccion()+"',Telefono ='"+
                        c.getTelefono()+"',Negocio ='"+
                        c.getNegocio()+"'"+ " WHERE  Curp='"+
                        c.getCurp().toUpperCase()+"'");
		return  conexion.ejecutarInstruccionSQL("UPDATE Clientes SET Nombre ='"+
                        c.getNombre()+"',Primer_Ap ='"+
                        c.getPrimerAp()+"',Segundo_Ap ='"+
                        c.getSegundoAp()+"',Direccion ='"+
                        c.getDireccion()+"',Telefono ='"+
                        c.getTelefono()+"',Negocio ='"+
                        c.getNegocio()+"'"+ " WHERE  Curp='"+
                        c.getCurp().toUpperCase()+"'");
		
		//System.out.println(x);
		
	}

    public ArrayList<ArrayList> consultaVentasCliente() {
        ArrayList<ArrayList> lista = new ArrayList<>();
        ArrayList<Integer> listaNumCompras = new ArrayList<>();
        ArrayList<String> listaClientes = new ArrayList<>();
        sql = " SELECT * FROM num_compras ";

        ResultSet rs = conexion.ejecutarConsulta(sql);

        if (rs == null) {
            return null;
        } else {

            try {
                lista.add(listaClientes);
                lista.add(listaNumCompras);

                while (rs.next()) {
                    listaClientes.add(rs.getString(2));
                    listaNumCompras.add(rs.getInt(5));
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
                return null;
            }
            return lista;
        }
    }
}
