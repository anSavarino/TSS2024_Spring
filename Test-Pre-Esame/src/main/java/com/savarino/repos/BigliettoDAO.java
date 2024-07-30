package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Biglietto;

public interface BigliettoDAO extends JpaRepository<Biglietto, Integer> {

}
