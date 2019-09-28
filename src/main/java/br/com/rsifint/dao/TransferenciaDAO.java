package br.com.rsifint.dao;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.rsifint.models.Conta;

@Entity
public class TransferenciaDAO {
	
	@Id
	private int id;
	
	@OneToOne
	private Conta contaOrigem;
	
	@OneToOne
	private Conta contaDestino;
	
	@Column
	private BigDecimal valor;
	
	@Column
	private String motivo;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
	
}
