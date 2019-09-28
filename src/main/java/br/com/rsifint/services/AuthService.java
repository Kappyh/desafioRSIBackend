package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.dao.UsuarioIdentity;
import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.models.Usuario;
import br.com.rsifint.repositories.UsuarioRepository;

@Service
public class AuthService {

//	private UsuarioDAO dao;
//	private UsuarioRepository repository;
	
	
	public AuthService() {
//		this.dao = new UsuarioDAO();
//		this.repository = repository;
	}
	
	
	public String autenticarUsuario(Usuario usuario) throws NegocioException {
		//UsuarioIdentity id = new UsuarioIdentity();
//		
//		if(usuario == null || usuario.getCpf() == null) {
//			throw new NegocioException("Informar o usuario a ser procurado!");
//		}
//		
//		UsuarioDAO encontrado = repository.getByCpf(usuario.getCpf());
//		if(encontrado == null || (usuario.getSenha() == null || !usuario.getSenha().equals(encontrado.getSenha()))) {
//			throw new NegocioException("Usuario ou senha invalidos");
//		}
		
		return "ASHDSADKLWERDLAKXZVKRELWRTKDLSDFJSAKDAS";
		
	}
}
