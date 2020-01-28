package br.com.bertini.exercicio.calculadora;

import java.util.Scanner;

import br.com.bertini.exercicio.calculadora.servico.Calculo;
import br.com.bertini.exercicio.calculadora.servico.impl.DivisaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.MultiplicacaoServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SomaServico;
import br.com.bertini.exercicio.calculadora.servico.impl.SubtracaoServico;

public class ExecutorComIf {

	public static void main (String[] args) {
		try (Scanner sc= new Scanner(System.in)) {
			System.out.println("Escolha a operacao: ------");
			int tipoOperacao = sc.nextInt();
			
			System.out.println("Primeiro Valor");
			double valor1 = sc.nextDouble();
			
			System.out.println("Segundo valor");
			double valor2 = sc.nextDouble();
			
			if (tipoOperacao == 1) {
				Calculo soma = new SomaServico();
				System.out.println(soma.calculo(valor1, valor2));
			}
			
			else if (tipoOperacao == 2) {
				Calculo soma = new SubtracaoServico();
				System.out.println(soma.calculo(valor1, valor2));
						
			}
			
			else if (tipoOperacao == 3) {
				Calculo soma = new MultiplicacaoServico();
				System.out.println(soma.calculo(valor1, valor2));
			}
			
			else if (tipoOperacao == 4) {
				Calculo soma = new DivisaoServico();
				System.out.println(soma.calculo(valor1, valor2));
			}
			
			
		}
	}
}
