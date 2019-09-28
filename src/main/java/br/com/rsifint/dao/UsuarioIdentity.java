package br.com.rsifint.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
@SequenceGenerator(name = "usuarioIdGenerator", sequenceName="USUARIO_ID_GENERATOR", allocationSize=1)
public class UsuarioIdentity implements Serializable{
	
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioIdGenerator")
	private Long id;
	
	@Column
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
