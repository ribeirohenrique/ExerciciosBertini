package exercicio.cachorro;

public class Cachorro{

    String strRaca;
    String strPorte;
    String strTemperamento;
    String strNome;

    public String getStrRaca() {
        return strRaca;
    }

    public void setStrRaca(String strRaca) {
        this.strRaca = strRaca;
    }

    public String getStrPorte() {
        return strPorte;
    }

    public void setStrPorte(String strPorte) {
        this.strPorte = strPorte;
    }

    public String getStrTemperamento() {
        return strTemperamento;
    }

    public void setStrTemperamento(String strTemperamento) {
        this.strTemperamento = strTemperamento;
    }

    public String getStrNome() {
        return strNome;
    }

    public void setStrNome(String strNome) {
        this.strNome = strNome;
    }

    @Override
    public String toString() {
        return "Cachorro [strNome=" + strNome + ", strPorte=" + strPorte + ", strRaca=" + strRaca + ", strTemperamento="
                + strTemperamento + "]";
    }
    
    
}