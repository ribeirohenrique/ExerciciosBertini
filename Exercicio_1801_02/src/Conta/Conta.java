package Conta;

public class Conta {

	int numero;
	String titular;
	double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
		
	
	
}
