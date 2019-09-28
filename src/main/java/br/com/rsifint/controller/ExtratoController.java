package br.com.rsifint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rsifint.services.ExtratoService;

@RestController
@RequestMapping("/extrato")
public class ExtratoController {

	private ExtratoService extratoService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getExtrato(@PathVariable("id")Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body("extrato");
	}
	
	@PostMapping("/")
	public ResponseEntity<?> storeExtrato(){
		return ResponseEntity.status(HttpStatus.CREATED).body("Registro inserido com sucesso");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteRegistroExtrato(@PathVariable("id")Integer id){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Registro deletado");
	}
}
