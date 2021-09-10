package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta {
    private double desconto = 0.8;

    public ConsultaPrata() {
        super("Prata");
    }

    @Override
    public double getValorDaConsulta() {
        return super.getValorDaConsulta() * desconto;
    }
}
