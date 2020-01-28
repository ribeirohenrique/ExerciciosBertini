package br.com.bertini.exercicio.calculadora.dominio;

import br.com.bertini.exercicio.calculadora.servico.Calculo;
import br.com.bertini.exercicio.calculadora.servico.impl.DivisaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.MultiplicacaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SomaServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SubtracaoServico;

public enum TipoCalculo {
	
	SOMA(1){
		@Override
		public Calculo obterTipoCalculo() {
			return new SomaServico();
		}
	},
	
	SUBTRACAO(2){
		@Override
		public Calculo obterTipoCalculo() {
			return new SubtracaoServico();
			
		}
	},
	
	MULTIPLICACAO(3){
		@Override
		public Calculo obterTipoCalculo() {
			return new MultiplicacaoServico();
			
		}
	},
	
	DIVISAO(4){
		@Override
		public Calculo obterTipoCalculo() {
			return new DivisaoServico();
			
		}
	};
	
	private Integer tipoOperacao;
	
	public abstract Calculo obterTipoCalculo();
	
	private TipoCalculo(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	public Integer getTipoOperacao() {
		return this.tipoOperacao;
		
	}
	
}
