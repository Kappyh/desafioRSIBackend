package br.com.rsifint.services;

import org.springframework.stereotype.Service;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.exception.NegocioException;

@Service
public class AuthService {

	private UsuarioDAO dao;
	
	public AuthService() {
		this.dao = new UsuarioDAO();
	}
	
	
	public String autenticarUsuario(String cpf, String senha) throws NegocioException {
		if(cpf == null || cpf.trim().equals("") || senha == null || senha.trim().equals("")) {
			throw new NegocioException("Usuario ou senhas invalidos");
		}
		
		return "token x";
	}
}
