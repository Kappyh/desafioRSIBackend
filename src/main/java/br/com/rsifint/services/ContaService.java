package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.models.Conta;
import br.com.rsifint.repositories.ContaRepository;

@Service
public class ContaService {

	
	private ContaRepository repository;

	@Autowired
	public ContaService(ContaRepository repository) {
		this.repository = repository;
	}
	
	public Conta createConta() {
		Conta conta = new Conta();
		return conta;
	}

}
