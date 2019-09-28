package br.com.rsifint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.models.Usuario;
import br.com.rsifint.services.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	public UsuarioService service;
	
	@PostMapping("/usuario")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario){
		
		try {
			return new ResponseEntity<String>(service.cadastrarUsuario(usuario), HttpStatus.CREATED);
		} catch (NegocioException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED);
		}
		
	}
	
	

}
