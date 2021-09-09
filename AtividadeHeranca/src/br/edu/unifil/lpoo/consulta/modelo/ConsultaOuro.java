package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta {
    private double desconto = 0.7;

    public ConsultaOuro() {
        super("Ouro");
    }

    @Override
    public double getValorDaConsulta() {
        if (getAnoDeInclusao() <= 2000) {
            desconto = 0;
            return super.getValorDaConsulta() * desconto;
        }

        return super.getValorDaConsulta() * desconto;
    }
}
