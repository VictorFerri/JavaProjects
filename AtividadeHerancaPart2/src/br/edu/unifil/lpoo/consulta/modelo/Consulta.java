package br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nomeDoPassiente;
    private String numerosMatricula;

    protected int numeroDeDependentes;
    protected int anoDeInclusao;
    protected double valorDaConsulta;
    protected String tipoConsulta;

    public Consulta(String tipoConsultaNovo) {
        this.tipoConsulta = tipoConsultaNovo;
    }

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

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setNomeDoPassiente(String novoNomeDoPassiente) {

        this.nomeDoPassiente = novoNomeDoPassiente;
    }

    public void setNumerosMatricula(String novoNumerosMatricula) {
        this.numerosMatricula = novoNumerosMatricula;
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
