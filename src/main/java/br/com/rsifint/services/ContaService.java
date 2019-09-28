package br.com.rsifint.services;

import org.springframework.stereotype.Service;

import br.com.rsifint.dao.ContaDAO;
import br.com.rsifint.models.Conta;

@Service
public class ContaService {

	private ContaDAO contaDao;

	public ContaService() {
		this.contaDao = new ContaDAO();
	}
	
	public Conta createConta() {
		Conta conta = new Conta();
		return conta;
	}

}
