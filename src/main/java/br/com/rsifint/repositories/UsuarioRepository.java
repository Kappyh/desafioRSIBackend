package br.com.rsifint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.dao.UsuarioIdentity;

public interface UsuarioRepository extends JpaRepository<UsuarioDAO, UsuarioIdentity> {

	@Query(value = "SELECT USUARIO_ID_GENERATOR.NEXTVAL FROM USUARIODAO", nativeQuery = 
	        true)
	Long getNextSequenceValue();
}
