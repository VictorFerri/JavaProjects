package br.edu.unifil.lp1.abstrato.visao;

import br.edu.unifil.lp1.abstrato.controle.Controle;
import br.edu.unifil.lp1.abstrato.modelo.Funcionario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Controle controleGeral = new Controle();

        Funcionario funcionarioGeral;
        int opcaoPessoa = 1;

        while (opcaoPessoa == 1) {

            System.out.println("|--------------#Menu#--------------|");
            System.out.println("|1 - Incluir Funcionário:          |");
            System.out.println("|2 - Listar Funcionários:          |");
            System.out.println("|3 - Consultar Funcionário:        |");
            System.out.println("|4 - Excluir Funcionário:          |");
            System.out.println("|5 - Atualizar Salário de um Func: |");
            System.out.println("|9 - fim                           |");
            System.out.println("|----------------------------------|");
            System.out.println("");
            System.out.println("Selecione uma Opção:");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa) {
                case 1:
                    System.out.println("Qual o tipo do Funcionário?");
                    System.out.println("(1) | Mensalista");
                    System.out.println("(2) | Comissionado");
                    System.out.println("(3) | Horista");
                    System.out.println("(4) | Produção");

                    opcaoPessoa = teclado.nextInt();

                    controleGeral.cadastrarFuncionario(opcaoPessoa);

                    opcaoPessoa = 1;
                    break;
                case 2:
                    System.out.println("|----------------------------------|");
                    System.out.println(controleGeral.listaFuncionario());
                    System.out.println("|----------------------------------|");

                    opcaoPessoa = 1;
                    break;
                case 3:
                    System.out.println("Qual a matrícula do Funcionário?");
                    opcaoPessoa = teclado.nextInt();

                    if (controleGeral.getFuncionario(opcaoPessoa) == null) {
                        System.out.println("Não Encontrado");

                    } else {
                        funcionarioGeral = controleGeral.getFuncionario(opcaoPessoa);

                        System.out.printf("Nome: %s \n", funcionarioGeral.getNome());
                        System.out.printf("Salario: %s \n", funcionarioGeral.getSalario());
                    }

                    opcaoPessoa = 1;
                    break;
                case 4:
                    System.out.println("Qual a matrícula do Funcionário?");
                    opcaoPessoa = teclado.nextInt();

                    if (controleGeral.getFuncionario(opcaoPessoa) != null) {
                        funcionarioGeral = controleGeral.getFuncionario(opcaoPessoa);
                        controleGeral.excluiFuncionario(funcionarioGeral);

                        System.out.println("Excluído com Sucesso!");
                    } else {
                        System.out.println("Não Encontrado");
                    }

                    opcaoPessoa = 1;
                    break;
                case 5:
                    System.out.println("Qual a matrícula do Funcionário?");
                    opcaoPessoa = teclado.nextInt();

                    if (controleGeral.getFuncionario(opcaoPessoa) != null) {
                        funcionarioGeral = controleGeral.getFuncionario(opcaoPessoa);
                        System.out.println("Qual o salário?");
                        opcaoPessoa = teclado.nextInt();
                        funcionarioGeral.setSalario(opcaoPessoa);

                        System.out.println("Atualizado com Sucesso!");
                    } else {
                        System.out.println("Não Encontrado");
                    }


                    opcaoPessoa = 1;
                    break;
                case 9:
                    System.out.println("Obrigado por usar s2!");

                    opcaoPessoa = 0;
                    break;
                default:
                    break;
            }
        }
    }
}
