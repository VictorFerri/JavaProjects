package br.edu.unifil.lpoo.equipe.visao;

import br.edu.unifil.lpoo.equipe.modelo.Equipe;
import br.edu.unifil.lpoo.equipe.modelo.Jogador;
import br.edu.unifil.lpoo.equipe.modelo.ParametrosNulos;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws ParametrosNulos {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Equipe> equipes = new ArrayList<>();

        int opcaoPessoa = 1;
        int aux;

        while (opcaoPessoa == 1) {
            String nomeDaEquipe;
            String nomeDoJogador;
            String posicaoDoJogador;
            String novoNomeDoJogador;
            Jogador jogadorAtual;
            boolean sucesso = false;

            System.out.println("|--------------#Menu#--------------|");
            System.out.println("|1 - Criar Equipe:                 |");
            System.out.println("|2 - Mudar Nome da Equipe:         |");
            System.out.println("|3 - Adicionar Jogador na Equipe:  |");
            System.out.println("|4 - Remover Jogador na Equipe:    |");
            System.out.println("|5 - Listar Jogadores da Equipe:   |");
            System.out.println("|6 - Alterar Nome de um Jogador:   |");
            System.out.println("|7 - Alterar Posição de um Jogador |");
            System.out.println("|9 - fim                           |");
            System.out.println("");
            System.out.println("Selecione uma Opção:");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa) {
                case 1:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.nextLine();
                    equipes.add(new Equipe(nomeDaEquipe));
                    System.out.printf("Equipe '%s' cadastrada com sucesso! \n", nomeDaEquipe);
                    break;

                case 2:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe que deseja alterar?");
                    nomeDaEquipe = teclado.nextLine();
                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Para qual nome você deseja alterar?");
                            nomeDaEquipe = teclado.nextLine();
                            equipes.get(aux).setNomeDaEquipe(nomeDaEquipe);
                            System.out.printf("Nome alterado para '%s' com sucesso! \n", nomeDaEquipe);
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
                    }

                    opcaoPessoa = 1;
                    break;

                case 3:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.nextLine();
                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.nextLine();
                            System.out.println("Qual a posição do Jogador?");
                            posicaoDoJogador = teclado.nextLine();

                            equipes.get(aux).addJogador(new Jogador(nomeDoJogador, posicaoDoJogador));
                            System.out.printf("Jogador '%s' adicionado com sucesso! \n", nomeDoJogador);
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
                    }

                    opcaoPessoa = 1;
                    break;

                case 4:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.nextLine();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.nextLine();

                            equipes.get(aux).removeJogador(equipes.get(aux).getJogador(nomeDoJogador));
                            System.out.printf("Jogador '%s' removido com sucesso! \n", nomeDoJogador);
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
                    }

                    opcaoPessoa = 1;
                    break;

                case 5:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.nextLine();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            equipes.get(aux).listarJogadores();
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
                    }

                    opcaoPessoa = 1;
                    break;

                case 6:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe do Jogador?");
                    nomeDaEquipe = teclado.nextLine();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.nextLine();
                            jogadorAtual = equipes.get(aux).getJogador(nomeDoJogador);
                            System.out.println("Para qual nome deseja alterar?");
                            novoNomeDoJogador = teclado.nextLine();

                            jogadorAtual.setNome(novoNomeDoJogador);
                            System.out.printf("Nome alterado para '%s' com sucesso! \n", novoNomeDoJogador);
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
                    }

                    opcaoPessoa = 1;
                    break;

                case 7:
                    teclado.nextLine();
                    System.out.println("Qual o nome da Equipe do Jogador?");
                    nomeDaEquipe = teclado.nextLine();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.nextLine();
                            jogadorAtual = equipes.get(aux).getJogador(nomeDoJogador);
                            System.out.println("Para qual posição deseja alterar?");
                            posicaoDoJogador = teclado.nextLine();

                            jogadorAtual.setPosicao(posicaoDoJogador);
                            System.out.printf("Posição alterada para '%s' com sucesso \n", posicaoDoJogador);
                            sucesso = true;
                        }
                    }

                    if (!sucesso) {
                        System.out.println("Equipe não encontrada!");
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
