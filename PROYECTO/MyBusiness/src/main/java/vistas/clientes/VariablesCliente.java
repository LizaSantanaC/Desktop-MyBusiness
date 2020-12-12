/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.clientes;

import controlador.ClienteDAO;
import modelo.Cliente;
import recursos.Recursos;

/**
 *
 * @author liza
 */
public interface VariablesCliente {   
    Recursos r = Recursos.getRecursos();
    ClienteDAO cDAO = new ClienteDAO();
}
