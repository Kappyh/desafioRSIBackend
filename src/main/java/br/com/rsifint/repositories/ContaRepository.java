package br.com.rsifint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rsifint.dao.ContaDAO;
import br.com.rsifint.dao.ContaIdentity;
import br.com.rsifint.dao.TransferenciaDAO;

public interface ContaRepository extends JpaRepository<ContaDAO, ContaIdentity> {
	//public ContaDAO getByNumero(String numero);
}
