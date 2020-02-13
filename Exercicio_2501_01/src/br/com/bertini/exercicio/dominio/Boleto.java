package br.com.bertini.exercicio.dominio;
import java.time.LocalDate;

public class Boleto extends FormaPagamento{
	
	private String CodigoDigitavel;
	private LocalDate vencimento;
		
	public Boleto(Double valor, String codigoDigitavel, LocalDate vencimento) {
		super(valor);
		CodigoDigitavel = codigoDigitavel;
		this.vencimento = vencimento;
	}
	
	public String getCodigoDigitavel() {
		return CodigoDigitavel;
	}
	public void setCodigoDigitavel(String codigoDigitavel) {
		CodigoDigitavel = codigoDigitavel;
	}
	public LocalDate getVencimento() {
		return vencimento;
	}
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public String toString() {
		return "Boleto [CodigoDigitavel=" + CodigoDigitavel + ", vencimento=" + vencimento + ", valor=" + valor + "]";
	}
	
}

