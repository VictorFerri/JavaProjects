package br.edu.unifil.lpoo.universidade.visao;

import br.edu.unifil.lpoo.universidade.controle.Controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner teclado = new Scanner(System.in);

        int opcaoPessoa = 0;
        String tipoProfessor;

        do {
            System.out.println("|-------------------Menu------------------------");
            System.out.println("| 1: Cadastrar professor com dedicação exclusiva");
            System.out.println("| 2: Cadastrar professor horista");
            System.out.println("| 3: Consultar professor pela matrícula");
            System.out.println("| 4: Encerrar o programa");
            System.out.println("|-----------------------------------------------");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa) {
                case 1:
                    String nome, matricula;
                    float salario;
                    int aux = 0, horasTrabalhadas, licencasPremio;
                    do {
                        System.out.println("Informe o tipo de professor:");
                        teclado.nextLine();
                        tipoProfessor = teclado.next();
                        if (tipoProfessor.equals("dedicado") || tipoProfessor.equals("horista")) {
                            aux = 1;
                        } else {
                            System.out.println("O tipo de professor deve ser dedicado ou horista.");
                        }
                    } while (aux == 0);
                    System.out.println("Informe o nome do professor:");
                    teclado.nextLine();
                    nome = teclado.nextLine();
                    System.out.println("Informe o salário do professor:");
                    salario = teclado.nextFloat();
                    do {
                        aux = 0;
                        System.out.println("Informe a matrícula do professor:");
                        teclado.nextLine();
                        matricula = teclado.next();

                        if (matricula.length() != 5) {
                            System.out.println(matricula);
                            System.out.println("A matrícula deve ter 5 dígitos, por favor informe novamente.");
                        } else {
                            aux = 1;
                        }
                    } while (aux == 0);
                    if (tipoProfessor.equals("dedicado")) {
                        System.out.println("Informe o número de licenças prêmio do professor:");
                        teclado.nextLine();
                        licencasPremio = teclado.nextInt();
                        controle.incluiProfessor(tipoProfessor, nome, matricula, salario, licencasPremio);
                    } else {
                        System.out.println("Informe o número de horas trabalhadas do professor:");
                        teclado.nextLine();
                        horasTrabalhadas = teclado.nextInt();
                        controle.incluiProfessor(tipoProfessor, nome, matricula, salario, horasTrabalhadas);
                    }

                    opcaoPessoa = 0;
                    break;
                case 2:
                    controle.listaProfessores();
                    opcaoPessoa = 0;

                    break;
                case 3:
                    controle.mostraDados();
                    opcaoPessoa = 0;

                    break;
                case 4:
                    opcaoPessoa = 1;
                    opcaoPessoa = 0;

                    break;
                default:
                    System.out.println("Opcão incorreta!");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 4 para finalizar.");
                    opcaoPessoa = teclado.nextInt();

                    break;
            }
        } while(opcaoPessoa == 0);
    }
}
