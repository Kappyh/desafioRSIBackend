package br.com.rsifint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rsifint.dao.ExtratoDAO;

public interface ExtratoRepository extends JpaRepository<ExtratoDAO, Integer> { }
