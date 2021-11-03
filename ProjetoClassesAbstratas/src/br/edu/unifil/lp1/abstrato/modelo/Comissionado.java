package br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario {
    private float comissao;
    private int quantidadeVendida;

    public Comissionado(String nome, int matricula, float salario, float comissao, int quantidadeVendida) {
        super(nome, matricula, salario);
        this.comissao = comissao;
        this.quantidadeVendida = quantidadeVendida;
    }

    public float getComissao() {
        return comissao;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    @Override
    public float getGanhoMensal() {
        return getSalario() + getComissao() * getQuantidadeVendida();
    }
}
