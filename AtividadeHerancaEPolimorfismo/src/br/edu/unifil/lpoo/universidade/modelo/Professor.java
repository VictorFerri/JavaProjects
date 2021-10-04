package br.edu.unifil.lpoo.universidade.modelo;

public class Professor {
    protected String nome;
    protected String matricula;
    protected float salario;

    public Professor(String newNome, String newMatricula, float newSalario) {
        this.nome = newNome;
        this.matricula = newMatricula;
        this.salario = newSalario;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDados(){
        return "|nome: " + nome + "|salário: " + salario + "|matrícula: " + matricula;
    }
}
