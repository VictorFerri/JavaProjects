package br.edu.unifil.lpoo.consulta.visao;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.Scanner;

public class SistemaDaClinica {
    public static void main(String[] args) {
        CadastroDeConsultas cadastro = new CadastroDeConsultas();
        Scanner teclado = new Scanner(System.in);

        int y = 0;
        int opcaoPessoa;
        String tipoConsultaPorEscrito;

        do {
            System.out.println("                ##--Clínica--##               ");
            System.out.println("|--------------------------------------------|");
            System.out.println("| Opção 1 - Agendar consulta");
            System.out.println("| Opção 2 - Listar consultas");
            System.out.println("| Opção 3 - Consultar total de consultas");
            System.out.println("| Opção 4 - Consultar valor total de consultas");
            System.out.println("| Opção 5 - Encerrar o programa");
            System.out.println("|--------------------------------------------|");
            System.out.print("Digite uma opção: ");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa) {
                case 1:
                    String nomeDoPassiente;
                    String numerosMatricula;
                    int tipoConsulta;
                    int numeroDeDependentes;
                    int anoDeInclusao;
                    double valorDaConsulta;
                    int x = 0;


                    System.out.println("Qual o tipo de consulta?");
                    System.out.println("|-----------------------|");
                    System.out.println("| Opção 1 - Diamante");
                    System.out.println("| Opção 2 - Família");
                    System.out.println("| Opção 3 - Ouro");
                    System.out.println("| Opção 4 - Prata");
                    System.out.println("|-----------------------|");
                    System.out.print("Digite uma opção: ");
                    tipoConsulta = teclado.nextInt();

                    System.out.println("Informe o nome do paciente:");
                    teclado.nextLine();
                    nomeDoPassiente = teclado.nextLine();

                    System.out.println("Informe os 5 números da matricula:");
                    do {
                        numerosMatricula = teclado.nextLine();

                        if (numerosMatricula.length() != 5) {
                            System.out.println("Por favor insira um valor com 5 dígitos ");
                        } else {
                            x = 1;
                        }
                    } while (x == 0);

                    System.out.println("Informe o número de dependentes:");
                    numeroDeDependentes = teclado.nextInt();

                    System.out.println("Informe o ano de inclusão:");
                    do {
                        anoDeInclusao = teclado.nextInt();

                        if (anoDeInclusao > 1900 && anoDeInclusao < 2022) {
                            x = 1;
                        } else {
                            System.out.println("Por favor insira um valor com 4 dígitos ");
                            x = 0;
                        }
                    } while (x == 0);

                    System.out.println("Informe o valor da consulta:");
                    valorDaConsulta = teclado.nextDouble();


                    switch (tipoConsulta) {
                        case 1:
                            ConsultaDiamante novaConsultaDiamante = new ConsultaDiamante();

                            novaConsultaDiamante.setValorDaConsulta(valorDaConsulta);
                            novaConsultaDiamante.setNomeDoPassiente(nomeDoPassiente);
                            novaConsultaDiamante.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaDiamante.setNumerosMatricula(numerosMatricula);
                            novaConsultaDiamante.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaDiamante.setNumeroDeDependentes(numeroDeDependentes);
                            cadastro.addConsulta(novaConsultaDiamante);

                            break;
                        case 2:
                            ConsultaFamilia novaConsultaFamilia = new ConsultaFamilia();

                            novaConsultaFamilia.setValorDaConsulta(valorDaConsulta);
                            novaConsultaFamilia.setNomeDoPassiente(nomeDoPassiente);
                            novaConsultaFamilia.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaFamilia.setNumerosMatricula(numerosMatricula);
                            novaConsultaFamilia.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaFamilia.setNumeroDeDependentes(numeroDeDependentes);
                            cadastro.addConsulta(novaConsultaFamilia);

                            break;
                        case 3:
                            ConsultaOuro novaConsultaOuro = new ConsultaOuro();

                            novaConsultaOuro.setValorDaConsulta(valorDaConsulta);
                            novaConsultaOuro.setNomeDoPassiente(nomeDoPassiente);
                            novaConsultaOuro.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaOuro.setNumerosMatricula(numerosMatricula);
                            novaConsultaOuro.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaOuro.setNumeroDeDependentes(numeroDeDependentes);
                            cadastro.addConsulta(novaConsultaOuro);

                            break;
                        case 4:
                            ConsultaPrata novaConsultaPrata = new ConsultaPrata();

                            novaConsultaPrata.setValorDaConsulta(valorDaConsulta);
                            novaConsultaPrata.setNomeDoPassiente(nomeDoPassiente);
                            novaConsultaPrata.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaPrata.setNumerosMatricula(numerosMatricula);
                            novaConsultaPrata.setAnoDeInclusao(anoDeInclusao);
                            novaConsultaPrata.setNumeroDeDependentes(numeroDeDependentes);
                            cadastro.addConsulta(novaConsultaPrata);

                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + tipoConsulta);
                    }

                    break;
                case 2:
                    do {
                        System.out.println("Qual o tipo de consulta?:");
                        teclado.nextLine();
                        tipoConsultaPorEscrito = teclado.next();
                        if(tipoConsultaPorEscrito.equals("Prata") || tipoConsultaPorEscrito.equals("Ouro") || tipoConsultaPorEscrito.equals("Diamante") || tipoConsultaPorEscrito.equals("Familia")) {
                            y = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser Prata, Ouro, Diamante ou Familia.");
                            y = 0;
                        }
                    } while(y == 0);

                    cadastro.exibirConsultaPorPlano(tipoConsultaPorEscrito);
                    y = 0;

                    break;
                case 3:
                    do {
                        System.out.println("Qual o tipo de consulta?:");
                        teclado.nextLine();
                        tipoConsultaPorEscrito = teclado.next();
                        if(tipoConsultaPorEscrito.equals("Prata") || tipoConsultaPorEscrito.equals("Ouro") || tipoConsultaPorEscrito.equals("Diamante") || tipoConsultaPorEscrito.equals("Familia")) {
                            y = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser Prata, Ouro, Diamante ou Familia.");
                            y = 0;
                        }
                    } while(y == 0);

                    System.out.printf("Há um total de %s consultas nesse plano \n", cadastro.totalDeConsultas(tipoConsultaPorEscrito));
                    y = 0;

                    break;
                case 4:
                    do {
                        System.out.println("Qual o tipo de consulta?:");
                        teclado.nextLine();
                        tipoConsultaPorEscrito = teclado.next();
                        if(tipoConsultaPorEscrito.equals("Prata") || tipoConsultaPorEscrito.equals("Ouro") || tipoConsultaPorEscrito.equals("Diamante") || tipoConsultaPorEscrito.equals("Familia")) {
                            y = 1;
                        } else {
                            System.out.println("O tipo de consulta deve ser Prata, Ouro, Diamante ou Familia.");
                            y = 0;
                        }
                    } while(y == 0);

                    System.out.printf("Há um total de valor %s em consultas nesse plano \n", cadastro.valorTotalDeConsultas(tipoConsultaPorEscrito));
                    y = 0;

                    break;
                case 5:
                    System.out.println("Obrigado por usar! s2");
                    y = 1;
                    break;

                default:
                    System.out.println("Opcão incorreta!");
                    System.out.println("Digite 0 para voltar ao menu inicial ou 9 para finalizar.");
                    y = teclado.nextInt();
            }
        } while(y == 0);
    }
}
