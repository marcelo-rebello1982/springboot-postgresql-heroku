package com.marcelopaulo.algafood.domain.exception;

public class ColaboradorNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public ColaboradorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public ColaboradorNaoEncontradoException(Long colaboradorId) {
		this(String.format("Não existe um cadastro de cidade com código %d", colaboradorId));
	}
	
}
