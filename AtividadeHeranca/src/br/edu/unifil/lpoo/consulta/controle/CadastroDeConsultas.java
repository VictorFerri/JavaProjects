package br.edu.unifil.lpoo.consulta.controle;

import br.edu.unifil.lpoo.consulta.modelo.Consulta;

import java.util.ArrayList;

public class CadastroDeConsultas {
    private ArrayList<Consulta> listaConsultas = new ArrayList<Consulta>();

    public void addConsulta(Consulta novaConsulta) {
        String tipoConsulta = novaConsulta.getTipoConsulta();
        switch (tipoConsulta) {
            case "Diamante":
                listaConsultas.add(novaConsulta);
                break;
            case "Familia":
                listaConsultas.add(novaConsulta);
                break;
            case "Ouro":
                listaConsultas.add(novaConsulta);
                break;
            case "Prata":
                listaConsultas.add(novaConsulta);
                break;
        }
    }

    public void exibirConsultaPorPlano(String pesquisarConsulta) {

        if (listaConsultas.size() == 0) {
            System.out.println("Não há consultas cadastradas ainda");
        } else {
            System.out.println("[LISTANDO CONSULTAS DO PLANO " + pesquisarConsulta.toUpperCase() + "]");
            System.out.println("|-----------------------|");
            for (int i = 0; i < listaConsultas.size(); i++) {
                if (listaConsultas.get(i).getTipoConsulta().equals(pesquisarConsulta)) {
                    System.out.printf("Nome: %s \n", listaConsultas.get(i).getNomeDoPassiente());
                    System.out.printf("Matrícula: %s \n", listaConsultas.get(i).getNumerosMatricula());
                    System.out.println("|-----------------------|");
                }
            }
        }
    }

    public int totalDeConsultas(String pesquisarConsulta) {
        int totalConsultas = 0;

        for (int i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getTipoConsulta().equals(pesquisarConsulta)) {
                totalConsultas += 1;
            }
        }

        return totalConsultas;
    }

    public int valorTotalDeConsultas(String pesquisarConsulta) {
        int valorTotalConsultas = 0;
        for (int i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getTipoConsulta().equals(pesquisarConsulta)) {
                valorTotalConsultas += listaConsultas.get(i).getValorDaConsulta();
            }
        }
        return valorTotalConsultas;
    }

}