package br.com.rsifint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.exception.NegocioException;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@GetMapping("")
	public ResponseEntity teste() {
		
		try {
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("Teste");
		}catch(Exception err) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Teste");
		}
		
	}
	
}
