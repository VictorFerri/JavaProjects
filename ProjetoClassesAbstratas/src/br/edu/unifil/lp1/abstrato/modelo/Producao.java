package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario{
    private int quantidadeProduzida;

    public Producao(String nome, int matricula, float salario, int quantidadeProduzida) {
        super(nome, matricula, salario);
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public float getGanhoMensal() {
        return getSalario() * getQuantidadeProduzida();
    }
}
