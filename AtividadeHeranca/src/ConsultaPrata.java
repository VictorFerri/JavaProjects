public class ConsultaPrata extends Consulta {
    private double desconto = 0.8;

    @Override
    public double getValorDaConsulta() {
        return super.getValorDaConsulta() * desconto;
    }
}
