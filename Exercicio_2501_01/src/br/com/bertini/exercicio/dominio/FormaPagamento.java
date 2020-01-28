package br.com.bertini.exercicio.dominio;

public abstract class FormaPagamento {

	protected Double valor;
	
	public FormaPagamento(Double valor) {
	super();
	this.valor = valor;
}
}

