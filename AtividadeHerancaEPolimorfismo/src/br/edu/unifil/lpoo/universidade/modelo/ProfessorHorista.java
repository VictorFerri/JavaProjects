package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorHorista extends Professor{
    private int horasTrabalhadas;

    public ProfessorHorista(String newNome, String newMatricula, float newSalario, int horasTrabalhadas) {
        super(newNome, newMatricula, newSalario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float getSalario() {
        return super.getSalario() * horasTrabalhadas;
    }

    @Override
    public String getDados() {
        return super.getDados() + "|Horas Trabalhadas: " + horasTrabalhadas;
    }
}
