/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.dao.ClienteDao;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Service
public class ClienteService {

   ClienteDao clienteDao = new ClienteDao();

    List<Cliente> listaCli = new ArrayList<>();

    public ClienteService() {
        Cliente c = new Cliente();
        c.setDniruc("43621514");
        c.setNombres("Ruben Apaza");
        c.setDocumento("Natural");
        listaCli.add(c);
    }

    public boolean saveEntidad(Cliente cliente) {//create
        return this.listaCli.add(cliente);
    }

    public List<Cliente> listarEntidad() {//report
        
        return clienteDao.listarCliente();
    }

    public Cliente buscarCliente(String dnirucx) {//buscar
        return listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dnirucx))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) {//Update
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDniruc().equals(clientex.getDniruc())) // Filtrar por DNI
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(cliente
                        -> cliente.setNombres(clientex.getNombres()));
        //return this.listaCli.set(index, cliente);
        return buscarCliente(clientex.getDniruc());
    }

    public void deleteRegistEntdad(String dato) {//Delete
        listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dato))
                .findFirst().orElse(null));
    }
}
