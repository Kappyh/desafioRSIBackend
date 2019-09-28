package br.com.rsifint.dao;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
public class UsuarioIdentity {
	
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioIdGenerator")
    @SequenceGenerator(name = "usuarioIdGenerator", sequenceName="USUARIO_ID_GENERATOR", allocationSize=1)
	private Long id;
	
	@Column
	private Long cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	

}
