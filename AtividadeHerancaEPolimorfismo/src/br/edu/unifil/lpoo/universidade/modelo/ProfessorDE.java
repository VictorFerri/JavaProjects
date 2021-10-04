package br.edu.unifil.lpoo.universidade.modelo;

public class ProfessorDE extends Professor{
    private int quantidadeDeLincenca;

    public ProfessorDE(String newNome, String newMatricula, float newSalario, int newQuantidadeDeLincenca) {
        super(newNome, newMatricula, newSalario);
        this.quantidadeDeLincenca = newQuantidadeDeLincenca;
    }

    public int getQuantidadeDeLincenca() {
        return quantidadeDeLincenca;
    }

    public void setQuantidadeDeLincenca(int quantidadeDeLincenca) {
        this.quantidadeDeLincenca = quantidadeDeLincenca;
    }

    @Override
    public String getDados() {
        return super.getDados() + "|Quantida de lincença prêmio" + quantidadeDeLincenca;
    }
}
