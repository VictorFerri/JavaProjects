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

        String nomeDaEquipe;
        String nomeDoJogador;
        String posicaoDoJogador;
        String novoNomeDoJogador;
        Jogador jogadorAtual;


        while (opcaoPessoa == 1) {
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
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.next();
                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Nome já utilizado!");
                        } else {
                            equipes.add(new Equipe(nomeDaEquipe));
                            System.out.printf("Equipe %s cadastrada com sucesso!", nomeDaEquipe);
                        }
                    }

                    break;

                case 2:
                    System.out.println("Qual o nome da Equipe que deseja alterar?");
                    nomeDaEquipe = teclado.next();
                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Para qual nome você deseja alterar?");
                            nomeDaEquipe = teclado.next();
                            equipes.get(aux).setNomeDaEquipe(nomeDaEquipe);
                            System.out.printf("Nome alterado para %s com sucesso!", nomeDaEquipe);
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.next();
                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.next();
                            System.out.println("Qual a posição do Jogador?");
                            posicaoDoJogador = teclado.next();

                            equipes.get(aux).addJogador(new Jogador(nomeDoJogador, posicaoDoJogador));
                            System.out.printf("Jogador %s adicionado com sucesso!", nomeDoJogador);
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.next();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.next();

                            equipes.get(aux).removeJogador(equipes.get(aux).getJogador(nomeDoJogador));
                            System.out.printf("Jogador %s removido com sucesso!", nomeDoJogador);
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Qual o nome da Equipe?");
                    nomeDaEquipe = teclado.next();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            equipes.get(aux).listarJogadores();
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Qual o nome da Equipe do Jogador?");
                    nomeDaEquipe = teclado.next();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.next();
                            jogadorAtual = equipes.get(aux).getJogador(nomeDoJogador);
                            System.out.println("Para qual nome deseja alterar?");
                            novoNomeDoJogador = teclado.next();

                            jogadorAtual.setNome(novoNomeDoJogador);
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Qual o nome da Equipe do Jogador?");
                    nomeDaEquipe = teclado.next();

                    for (aux = 0; aux < equipes.size(); aux++) {
                        if (equipes.get(aux).getNomeDaEquipe().equals(nomeDaEquipe)) {
                            System.out.println("Qual o nome do Jogador?");
                            nomeDoJogador = teclado.next();
                            jogadorAtual = equipes.get(aux).getJogador(nomeDoJogador);
                            System.out.println("Para qual posição deseja alterar?");
                            posicaoDoJogador = teclado.next();

                            jogadorAtual.setPosicao(posicaoDoJogador);
                        } else {
                            throw new ParametrosNulos("Equipe não encontrada");
                        }
                    }
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
