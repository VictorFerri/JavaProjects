public class ConsultaDiamante extends Consulta {
    private double desconto = 0.6;

    @Override
    public double getValorDaConsulta() {
        return super.getValorDaConsulta() * desconto;
    }
}
