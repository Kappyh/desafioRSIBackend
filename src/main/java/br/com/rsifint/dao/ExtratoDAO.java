package br.com.rsifint.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.rsifint.models.Conta;

@Entity
public class ExtratoDAO {

	@Id
	private int id;
	
	@OneToOne
	private Conta conta;
	
	@OneToOne
	private  TransferenciaDAO transferencia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public TransferenciaDAO getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(TransferenciaDAO transferencia) {
		this.transferencia = transferencia;
	}
	
	
	
}