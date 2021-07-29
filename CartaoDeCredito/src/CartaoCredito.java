public class CartaoCredito {
    private int numero;
    private float saldo;
    private float limite;
    private float bonus;
    private String bandeira;

    public CartaoCredito(int numeroDoCartao, String bandeira){
        this.numero = numeroDoCartao;
        this.bandeira = bandeira;
    }
    public CartaoCredito(int numeroDoCartao, String bandeira, float limiteDoCartao){
        this.numero = numeroDoCartao;
        this.bandeira = bandeira;
        this.limite = limiteDoCartao;
    }

    public float getSaldo(){
        return saldo;
    }

    public float getLimite(){
        return limite;
    }

    public float getBonus(){
        return bonus;
    }

    public String getBandeira(){
        return bandeira;
    }

    public int getNumero(){
        return numero;
    }

    public void setBandeira(String novaBandeira) {
        if (novaBandeira.isBlank()) {
            System.out.println("Por favor insira um nome válido");
        } else {
            this.bandeira = novaBandeira;
        }
    }

    public void setLimite(float limiteNovo) {
        if (limiteNovo >= 1){ // coloquei >= 1, pois se for "> 0" pode-se colocar valores float de 0, por exemplo: 0.21
            this.limite = limiteNovo;
        } else{
            System.out.println("Por favor insira um valor maior que zero");
        }
    }

    public void addPagar(float valorPago){
        saldo -= valorPago;
        this.bonus += (valorPago * 0.02f);
    }

    public void addComprar(float valorCompra){
        saldo += valorCompra;
        this.bonus += (valorCompra * 0.03f);
    }

    private void creditaBonus(float valor){
        this.bonus += valor;

    }
}
