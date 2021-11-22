package com.marcelopaulo.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum MessagesTypes {

	DADOS_INVALIDOS("/dados-invalidos", "Dados inválidos"),
	CAFE_JA_CADASTRADO("/dados-invalidos", "ATENÇÃO : TIPO de CAFÉ JÁ CADASTRADO"),
	CPF_CAFE_JA_CADASTRADO("/dados-invalidos", "ATENÇÃO : TIPO de CAFÉ ou CPF JÁ CADASTRADO"),
	ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
	PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"),
	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível"),
	RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio");

	private String title;
	private String uri;
	
	MessagesTypes(String path, String title) {
		this.uri = "https://www.xxx.com.br" + path;
		this.title = title;
	}
	
}
