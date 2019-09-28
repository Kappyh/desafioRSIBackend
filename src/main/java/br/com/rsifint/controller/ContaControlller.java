package br.com.rsifint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.models.Conta;

@RestController
@RequestMapping("/conta")
public class ContaControlller {
	
	@RequestMapping("/create")
	public ResponseEntity<?> createConta(Conta conta) {
		return ResponseEntity.status(HttpStatus.CREATED).body("Conta criada com sucesso");
	}
	
	@RequestMapping("/fill")
	public ResponseEntity<?> fillSaldo(Conta conta){
		return ResponseEntity.status(HttpStatus.CREATED).body("Success Operation");
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<?> deleteConta(Conta conta){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Success Operation");
	}
}
