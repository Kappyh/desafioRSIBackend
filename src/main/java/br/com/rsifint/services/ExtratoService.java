package br.com.rsifint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rsifint.repositories.ExtratoRepository;

@Service
public class ExtratoService {

	@Autowired
	private ExtratoRepository repositorry;
	
	public ExtratoService() {
		
	}

}
