package br.com.rsifint.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaControlller {
	
	@RequestMapping("/create")
	public ResponseEntity<?> createConta(Integer id, String cpf) {
		return ResponseEntity.status(201).body("Conta criada com sucesso");
	}
}
