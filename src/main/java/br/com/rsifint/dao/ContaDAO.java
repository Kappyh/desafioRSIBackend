package br.com.rsifint.dao;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ContaDAO{

	@EmbeddedId
	private ContaIdentity contaIdentity;

	public ContaIdentity getContaIdentity() {
		return contaIdentity;
	}

	public void setContaIdentity(ContaIdentity contaIdentity) {
		this.contaIdentity = contaIdentity;
	} 
	
}
