package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.dao.ContaDAO;
import br.com.rsifint.repositories.ContaRepository;

@Service
public class ContaService {

	private ContaRepository repository;

	@Autowired
	public ContaService(ContaRepository repository) {
		this.repository = repository;
	}

	public String createConta() {
		try {
			ContaDAO contaDAO = new ContaDAO();
			repository.save(contaDAO);
			return "Conta criada com sucesso";
		} catch (Exception e) {
			return "Erro";
		}
	}

}
