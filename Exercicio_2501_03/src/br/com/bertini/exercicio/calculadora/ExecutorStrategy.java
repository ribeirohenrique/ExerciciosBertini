package br.com.bertini.exercicio.calculadora;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import br.com.bertini.exercicio.calculadora.dominio.TipoCalculo;
import br.com.bertini.exercicio.calculadora.servico.Calculo;

public class ExecutorStrategy {

	public static void main (String[] args) {
		try (Scanner sc= new Scanner(System.in)) {
			System.out.println("Escolha a operacao: ------");
			int tipoOperacao = sc.nextInt();
			
			System.out.println("Primeiro Valor");
			double valor1 = sc.nextDouble();
			
			System.out.println("Segundo valor");
			double valor2 = sc.nextDouble();
			
			Calculo calculoOperacao = null;
			
			//com Lambda
			Optional<TipoCalculo> tipoCalculo = Arrays.asList(TipoCalculo.values()).stream()
					.filter(f -> f.getTipoOperacao().intValue() == tipoOperacao).findFirst();
			
			calculoOperacao = tipoCalculo.get().obterTipoCalculo();
			System.out.println("Resultado: " + calculoOperacao.calculo(valor1, valor2));
		}
	}
	
}
