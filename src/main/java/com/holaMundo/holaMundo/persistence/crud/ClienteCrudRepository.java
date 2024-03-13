package com.holaMundo.holaMundo.persistence.crud;

import com.holaMundo.holaMundo.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {

    List<Cliente> findBycodigoClienteOrderByNombreAsc(int codigoCliente);
}
