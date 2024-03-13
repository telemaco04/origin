package com.holaMundo.holaMundo.persistence;

import com.holaMundo.holaMundo.persistence.crud.ClienteCrudRepository;
import com.holaMundo.holaMundo.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public java.util.List<Cliente> getByCodigoCliente(int codigoCliente){
        return clienteCrudRepository.findBycodigoClienteOrderByNombreAsc(codigoCliente);
    }

    public Optional<Cliente> getCliente(int dniCliente){
        return clienteCrudRepository.findById(dniCliente);
    }

    public Cliente save(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }

    public void delete(int dni){
        clienteCrudRepository.deleteById(dni);
    }
}
