package br.com.rsifint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.dao.UsuarioIdentity;

public interface UsuarioRepository extends JpaRepository<UsuarioDAO, UsuarioIdentity> {	
}
