package br.com.rsifint.services;

import org.springframework.stereotype.Service;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.models.Usuario;

@Service
public class AuthService {

	private UsuarioDAO dao;
	
	public AuthService() {
		this.dao = new UsuarioDAO();
	}
	
	
	public String autenticarUsuario(Usuario usuario) throws NegocioException {
		return "token x";
	}
}
