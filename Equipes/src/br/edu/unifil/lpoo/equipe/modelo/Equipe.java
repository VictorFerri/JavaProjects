package br.edu.unifil.lpoo.equipe.modelo;

import java.util.ArrayList;

public class Equipe {
    private String nomeDaEquipe;
    private ArrayList<Jogador> jogadores;

    public Equipe(String newNomeDaEquipe) {
        this.jogadores = new ArrayList<>();
        this.nomeDaEquipe = newNomeDaEquipe;
    }

    public String getNomeDaEquipe() {
        return nomeDaEquipe;
    }

    public void setNomeDaEquipe(String nomeDaEquipe) throws ParametrosNulos{
        if (nomeDaEquipe.equals("")) {
            throw new ParametrosNulos("Insira novamente!");
        } else {
            this.nomeDaEquipe = nomeDaEquipe;
        }
    }

    public void addJogador(Jogador newJogador) throws ParametrosNulos{
        if (newJogador == null) {
            throw new ParametrosNulos("Insira novamente!");
        } else {
            this.jogadores.add(newJogador);
        }
    }

    public void removeJogador(Jogador jogadorParaSerEliminado) throws ParametrosNulos{
        if (jogadorParaSerEliminado == null) {
            throw new ParametrosNulos("Insira novamente!");
        } else {
            jogadores.remove(jogadorParaSerEliminado);
        }
    }

    public void listarJogadores() {
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println("|----------------------------");
            System.out.printf("| Nome: %s", jogadores.get(i).getNome());
        }
    }

    public Jogador getJogador(String nomeDoJogador) throws ParametrosNulos {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNome().equals(nomeDoJogador)) {
                return jogadores.get(i);
            }
        }
        throw new ParametrosNulos("Não encontrado.");
    }
}
