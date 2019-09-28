package br.com.rsifint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private AuthService service;

	@Autowired
	public AuthController(AuthService service) {
		this.service = service;
	}

	@GetMapping("")
	public ResponseEntity<?> teste() {

		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.autenticarUsuario("1", "1"));
		} catch (Exception err) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Teste");
		}

	}

}
