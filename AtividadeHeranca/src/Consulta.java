public class Consulta {
    private String nomeDoPassiente;
    private String numerosMatricula;
    private int numeroDeDependentes;
    private int anoDeInclusao;
    private double valorDaConsulta;

    public String getNomeDoPassiente() {
        return nomeDoPassiente;
    }

    public String getNumerosMatricula() {
        return numerosMatricula;
    }

    public int getNumeroDeDependentes() {
        return  numeroDeDependentes;
    }

    public int getAnoDeInclusao() {
        return anoDeInclusao;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setNomeDoPassiente(String novoNomeDoPassiente) {
        this.nomeDoPassiente = novoNomeDoPassiente;
    }

    public void setNumerosMatricula(String novoNumerosMatricula) {
        if (novoNumerosMatricula.length() > 5 || novoNumerosMatricula.length() < 5) {
            System.out.println("Por favor insira um valor com 5 dígitos ");
        } else {
            this.numerosMatricula = novoNumerosMatricula;
        }
    }

    public void setNumeroDeDependentes(int novoNumeroDeDependentes) {
        this.numeroDeDependentes = novoNumeroDeDependentes;
    }

    public void setAnoDeInclusao(int novoAnoDeInclusao) {
        this.anoDeInclusao = novoAnoDeInclusao;
    }

    public void setValorDaConsulta(double novoValorDaConsulta) {
        this.valorDaConsulta = novoValorDaConsulta;
    }
}
