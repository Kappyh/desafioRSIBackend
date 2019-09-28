package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.dao.ContaDAO;
import br.com.rsifint.dao.TransferenciaDAO;
import br.com.rsifint.exception.NegocioException;
import br.com.rsifint.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
	
	
	@Autowired
	private TransferenciaRepository repository;
	
	
	public TransferenciaService() {
		
	}
	
	public String transfer(TransferenciaDAO transfer) throws NegocioException {
		try {
			if(transfer == null || transfer.getContaDestino()  == null 
					|| transfer.getContaOrigem()  == null ) {
				throw new NegocioException("Dados incorretos! todos os dados devem ser informados para o processamento da transferencia");
			}
			
			
			return "SADS-ADDDA-3232";
		}catch (Exception e) {
			throw new NegocioException("Erro ao executar a trasbferencia");
		}
	}

}
