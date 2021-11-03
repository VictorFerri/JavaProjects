package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario{
    private int horasTrabalhadas;

    public Horista(String nome, int matricula, float salario, int horasTrabalhadas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float getGanhoMensal() {
        return getSalario() * getHorasTrabalhadas();
    }
}
