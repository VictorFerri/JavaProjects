package br.edu.unifil.lpoo.equipe.modelo;

public class Jogador {
    private String nome;
    private String posicao;

    public Jogador(String newNome, String newPosicao) {
        this.nome = newNome;
        this.posicao = newPosicao;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) throws ParametrosNulos {
        if (nome.equals("")) {
            throw new ParametrosNulos("Insira novamente!");
        } else {
            this.nome = nome;
        }
    }

    public void setPosicao(String posicao) throws ParametrosNulos {
        if (posicao.equals("")) {
            throw new ParametrosNulos("Insira novamente!");
        } else {
            this.posicao = posicao;
        }
    }

}
