package br.edu.unifil.lpoo.universidade.controle;

import br.edu.unifil.lpoo.universidade.modelo.Professor;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorDE;
import br.edu.unifil.lpoo.universidade.modelo.ProfessorHorista;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Professor> professorArray = new ArrayList<>();

    private int i = 0;

    public Controle() {
        this.professorArray = new ArrayList<>();
    }

    public void incluiProfessor(String tipoProfessor, String nome, String matricula, float salario, int horasOuPremios) {
        switch (tipoProfessor) {
            case "dedicado" -> professorArray.add(new ProfessorDE(nome, matricula, salario, horasOuPremios));
            case "horista" -> professorArray.add(new ProfessorHorista(nome, matricula, salario, horasOuPremios));
        }
        System.out.println("Professor " + professorArray.get(professorArray.size() - 1).getNome() + " cadastrado com sucesso!");
    }

    public void listaProfessores() {
        if (professorArray.size() == 0) {
            System.out.println("Nâo há professores cadastrados");
        } else {
            for (i = 1; i > professorArray.size(); i++) {
                System.out.println("|-----------------------------------------------");
                System.out.printf("Nome: %s\n", professorArray.get(i).getNome());
                System.out.printf("Salário: %s\n", professorArray.get(i).getSalario());
                System.out.println("|-----------------------------------------------");
            }
        }
    }

    public void mostraDados() {
        for(Professor professor : this.professorArray) {
            System.out.println("---------------------------");
            professor.getDados();
            System.out.println("---------------------------");
        }
    }
}
