package br.com.rsifint.dao;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class UsuarioDAO {
	
	@EmbeddedId
	private UsuarioIdentity usuarioIdentity;
	
	@Column
	private String email;
	
	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	
	@Column
	private String password;
	
	@Column
	private String dataNascimento;
	
	@Column
	private String rua;
	
	@Column
	private Integer numero;
	
	@Column
	private String complemento;
	
	@Column
	private String bairro;
	
	@Column
	private String cidade;
	
	@Column
	private String estado;
	
	@Column
	private String pais;


	public UsuarioIdentity getUsuarioIdentity() {
		return usuarioIdentity;
	}

	public void setUsuarioIdentity(UsuarioIdentity usuarioIdentity) {
		this.usuarioIdentity = usuarioIdentity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
