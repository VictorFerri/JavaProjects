package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {
    private double desconto = 0.5;

    public ConsultaFamilia() {
        super("Familia");
    }

    @Override
    public double getValorDaConsulta() {
        if (getNumeroDeDependentes() > 2) {
            return super.getValorDaConsulta() * desconto;
        }

        return super.getValorDaConsulta();
    }
}
