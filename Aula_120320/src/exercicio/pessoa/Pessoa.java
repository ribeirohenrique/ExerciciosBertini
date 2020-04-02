package exercicio.pessoa;

public class Pessoa{

    private String strNome;
    private String strSexo;
    private double numIdade;
    private double numCpf;
    private double numRg;
	
    public Pessoa(String strNome, String strSexo, double numIdade, double numCpf, double numRg) {
		super();
		this.strNome = strNome;
		this.strSexo = strSexo;
		this.numIdade = numIdade;
		this.numCpf = numCpf;
		this.numRg = numRg;
	}

	public String getStrNome() {
		return strNome;
	}

	public void setStrNome(String strNome) {
		this.strNome = strNome;
	}

	public String getStrSexo() {
		return strSexo;
	}

	public void setStrSexo(String strSexo) {
		this.strSexo = strSexo;
	}

	public double getNumIdade() {
		return numIdade;
	}

	public void setNumIdade(double numIdade) {
		this.numIdade = numIdade;
	}

	public double getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(double numCpf) {
		this.numCpf = numCpf;
	}

	public double getNumRg() {
		return numRg;
	}

	public void setNumRg(double numRg) {
		this.numRg = numRg;
	}

	@Override
	public String toString() {
		return "Pessoa [strNome=" + strNome + ", strSexo=" + strSexo + ", numIdade=" + numIdade + ", numCpf=" + numCpf
				+ ", numRg=" + numRg + "]";
	}


}

    