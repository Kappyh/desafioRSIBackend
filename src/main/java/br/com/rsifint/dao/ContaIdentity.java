package br.com.rsifint.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
public class ContaIdentity implements Serializable{
 
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioIdGenerator")
    @SequenceGenerator(name = "usuarioIdGenerator", sequenceName="USUARIO_ID_GENERATOR", allocationSize=1)
	private Long id;
	
	private Integer numero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
}
