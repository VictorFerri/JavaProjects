package br.edu.unifil.lp1.abstrato.modelo;

public class Mensalista extends Funcionario{
    public Mensalista(String nome, int matricula, float salario) {
        super(nome, matricula, salario);
    }

    @Override
    public float getGanhoMensal() {
        return getSalario();
    }
}
