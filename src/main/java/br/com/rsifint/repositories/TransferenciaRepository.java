package br.com.rsifint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rsifint.dao.TransferenciaDAO;

public interface TransferenciaRepository extends JpaRepository<TransferenciaDAO, Integer> {
	
}
