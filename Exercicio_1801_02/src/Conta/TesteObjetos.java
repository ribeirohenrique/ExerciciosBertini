package Conta;

import Conta.Conta;

public class TesteObjetos {
	
	public static void main (String[] args) {
		Conta conta1 = new Conta();
		conta1.setTitular("Orlando");
		conta1.setSaldo(777.70);
		
		Conta conta2 = new Conta();
		conta2.setTitular("Vera");
		conta2.setSaldo(377);
		
		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
		
		System.out.println("Atribuindo conta2 a conta1");
		
		conta1 = conta2;
		
		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
		
		conta1.setSaldo(2000);
		
		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
		System.out.println("------------------");
			
		conta1 = new Conta();
		conta1.setTitular("Orlando");
		conta1.setSaldo(100);
		
		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
	
	}

}
