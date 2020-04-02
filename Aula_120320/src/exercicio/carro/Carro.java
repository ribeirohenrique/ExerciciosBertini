package exercicio.carro;

public class Carro{

    String strMarca;
    String strModelo;
    String strCor;

    int numPessoas;
    int numAno;

    double qtdCombustivel;
    double capCombustivel;
    
	public Carro(String strMarca, String strModelo, String strCor, int numPessoas, int numAno, double qtdCombustivel,
			double capCombustivel) {
		this.strMarca = strMarca;
		this.strModelo = strModelo;
		this.strCor = strCor;
		this.numPessoas = numPessoas;
		this.numAno = numAno;
		this.qtdCombustivel = qtdCombustivel;
		this.capCombustivel = capCombustivel;
    }
    
    public String getStrMarca() {
        return strMarca;
    }

    public void setStrMarca(final String strMarca) {
        this.strMarca = strMarca;
    }

    public String getStrModelo() {
        return strModelo;
    }

    public void setStrModelo(final String strModelo) {
        this.strModelo = strModelo;
    }

    public String getStrCor() {
        return strCor;
    }

    public void setStrCor(final String strCor) {
        this.strCor = strCor;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(final int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int getNumAno() {
        return numAno;
    }

    public void setNumAno(final int numAno) {
        this.numAno = numAno;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(final double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(final double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    @Override
    public String toString() {
        return "Carro [capCombustivel=" + capCombustivel + ", numAno=" + numAno + ", numPessoas=" + numPessoas
                + ", qtdCombustivel=" + qtdCombustivel + ", strCor=" + strCor + ", strMarca=" + strMarca
                + ", strModelo=" + strModelo + "]";
    }

    
}