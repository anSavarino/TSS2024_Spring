package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
