package br.com.rsifint.services;

import org.springframework.stereotype.Service;

import br.com.rsifint.dao.UsuarioDAO;
import br.com.rsifint.dao.UsuarioIdentity;
import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.models.Usuario;
import br.com.rsifint.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	private UsuarioRepository repository;

	public String cadastrarUsuario(Usuario usuario) throws NegocioException{
		
		if(usuario.getCpf() == null){
			throw new NegocioException("Campo cpf inválido");
		}
		
		if(usuario.getEmail() == null || usuario.getEmail().equals("")) {
			throw new NegocioException("Campo email inválido");
		}
		
		if(usuario.getNome() == null || usuario.getNome().equals("")) {
			throw new NegocioException("Campo nome inválido");
		}
		
		if(usuario.getSobrenome() == null || usuario.getSobrenome().equals("")) {
			throw new NegocioException("Campo sobrenome inválido");
		}
		
		if(usuario.getPassword() == null || usuario.getPassword().equals("")) {
			throw new NegocioException("Campo password inválido");
		}
		
		UsuarioDAO usuarioEntity = new UsuarioDAO();
		
		usuarioEntity.setBairro(usuario.getBairro());
		usuarioEntity.setCidade(usuario.getCidade());
		usuarioEntity.setComplemento(usuario.getComplemento());
		usuarioEntity.setDataNascimento(usuario.getDataNascimento());
		usuarioEntity.setEmail(usuario.getEmail());
		usuarioEntity.setEstado(usuario.getEstado());
		usuarioEntity.setNome(usuario.getNome());
		usuarioEntity.setNumero(usuario.getNumero());
		usuarioEntity.setPais(usuario.getPais());
		usuarioEntity.setPassword(usuario.getPassword());
		usuarioEntity.setRua(usuario.getRua());
		usuarioEntity.setSobrenome(usuario.getSobrenome());
		usuarioEntity.setUsuarioIdentity(new UsuarioIdentity());
		usuarioEntity.getUsuarioIdentity().setCpf(usuario.getCpf());
		
		try {
			repository.save(usuarioEntity);
		}catch(Exception e){
			throw new NegocioException("Erro de servidor");
		}
		
		
		return "Usuario cadastrado com sucesso";
	}

}
