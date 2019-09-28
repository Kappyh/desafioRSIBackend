package br.com.rsifint.exception;

public class NegocioException extends Exception {
	
	private static final long serialVersionUID = 123L;

	public NegocioException(String mensagem) {
		super(mensagem);
	}

}
