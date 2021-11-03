package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa {
    private int matricula;
    private float salario;

    public Funcionario(String nome, int matricula, float salario) {
        super(nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        } else {
            this.salario = salario;
        }
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public abstract float getGanhoMensal();
}
