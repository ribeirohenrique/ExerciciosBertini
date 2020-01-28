package br.com.bertini.exercicio;

import br.com.bertini.exercicio.dominio.Estagiario;
import br.com.bertini.exercicio.dominio.Gerente;
import br.com.bertini.exercicio.dominio.Programador;

public class Executor {
	
	public static void main (String[] args) {
		
		Estagiario estagiario = new Estagiario ("Henrique", 18, 1000.0);
		System.out.println(estagiario);
		
		Programador programador = new Programador ("Joao", 18, 1000.0);
		System.out.println(programador);
		
		Gerente gerente = new Gerente ("Zé", 18, 15000.0);
		System.out.println(gerente);
	}
}
