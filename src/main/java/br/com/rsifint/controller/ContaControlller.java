package br.com.rsifint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.models.Conta;
import br.com.rsifint.services.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaControlller {
	
	private ContaService contaService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createConta(Conta conta) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.contaService.createConta());
	} 
	
	@PostMapping("/fill")
	public ResponseEntity<?> fillSaldo(Conta conta){
		return ResponseEntity.status(HttpStatus.CREATED).body("Success Operation");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getConta(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body("yes");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteConta(Conta conta){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Success Operation");
	}
}
