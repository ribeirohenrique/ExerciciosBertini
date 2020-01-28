package br.com.bertini.exercicio.calculadora;

import br.com.bertini.exercicio.calculadora.servico.Calculo;
import br.com.bertini.exercicio.calculadora.servico.impl.SomaServico;

public class ExecutorSimples {
	
	public static void main (String[] args) {
		
		Calculo soma = new SomaServico();
		System.out.println(soma.calculo(100.00, 100.00));
		
		
	}
}
