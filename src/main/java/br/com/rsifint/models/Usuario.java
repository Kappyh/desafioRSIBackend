package br.com.rsifint.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	private Long cpf;
	
	private String email;

	private String nome;

	private String sobrenome;

	private String password;

	private String dataNascimento;

	private String rua;

	private Integer numero;

	private String complemento;

	private String bairro;

	private String cidade;

	private String estado;

	private String pais;

}
