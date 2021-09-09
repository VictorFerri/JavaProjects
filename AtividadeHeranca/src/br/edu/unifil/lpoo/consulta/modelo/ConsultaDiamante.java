package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta {
    private double desconto = 0.6;

    public ConsultaDiamante() {
        super("Diamante");
    }

    @Override
    public double getValorDaConsulta() {
        return super.getValorDaConsulta() * desconto;
    }
}
