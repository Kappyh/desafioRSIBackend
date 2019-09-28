package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.dao.ContaDAO;
import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.models.Conta;
import br.com.rsifint.repositories.ContaRepository;

@Service
public class ContaService {

	
	private ContaRepository repository;

	@Autowired
	public ContaService(ContaRepository repository) {
		this.repository = repository;
	}
	
	public String createConta(ContaDAO conta) throws NegocioException {
		try {
			repository.save(conta);
			
			return "sds-asdd-sadas";
		}catch (Exception e) {
			throw new NegocioException("Nao foi possivel criar a conta " + conta.getContaIdentity().getNumero());
		}
	}
	
	

}
