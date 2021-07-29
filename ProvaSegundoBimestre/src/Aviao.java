public class Aviao {
    private String nomeVoo;
    private char estado;
    private int quantidadeMaxima;
    private int quantidadePassageiros;

    public Aviao(int quantidadeMaximaPassageirosAviao){
        this.estado = 'P';
        this.quantidadeMaxima = quantidadeMaximaPassageirosAviao;
    }

    public void decolar(){
        if (this.estado == 'P'){
            this.estado = 'V';
            System.out.println("Decolado com sucesso!!");
        } else {
            System.out.println("Você já está decolando");
        }
    }

    public void pousar(){
        if (this.estado == 'V'){
            this.estado = 'P';
            System.out.println("Pousado com sucesso!!");
        } else {
            System.out.println("Você não está voando");
        }
    }

    public String getNomeVoo(){
        return this.nomeVoo;
    }

    public String getEstado(){
        if (this.estado == 'P'){
            return "Parado";
        } else{
            return "Voando";
        }
    }

    public int getQuantidadePassagueiros(){
        return this.quantidadePassageiros;
    }

    public void setNomeVoo(String novoNomeVoo){
        if (novoNomeVoo.isBlank()){
            System.out.println("Por favor insira um nome coreto");
        } else{
            this.nomeVoo = novoNomeVoo;
            System.out.printf("Nome alterado para %s com sucesso!! \n", novoNomeVoo);
        }
    }

    public void setQuantidadeMaxima(int novaQuantidadeMaxima){
        if(novaQuantidadeMaxima <=0 || novaQuantidadeMaxima > this.quantidadeMaxima){
            System.out.printf("Por favor insira um valor positivo, maior que zero e menor que a quantidade máxima que é: %s", this.quantidadeMaxima);
        } else{
            this.quantidadeMaxima = novaQuantidadeMaxima;
            System.out.printf("Novo máximo alterado para %s \n", novaQuantidadeMaxima);
        }
    }

    public int getQuantidadeMaxima() {
        return this.quantidadeMaxima;
    }

    public void embarcar(){
        if (this.estado == 'P'){
            if (this.quantidadePassageiros > this.quantidadeMaxima){
                this.quantidadePassageiros += 1;
                System.out.println("Embarcado com sucesso! \n");
            } else {
                System.out.println("Quantidade máxima já foi preenchida \n");
            }
        } else {
            System.out.println("O avião não está parado \n");
        }

    }

    public void desembarcar(){
        if (this.estado == 'P'){
            if (this.quantidadePassageiros >= 1){
                this.quantidadePassageiros -= 1;
                System.out.println("Desembarcado com sucesso! \n");
            } else {
                System.out.println("Não há mais passageiros \n");
            }
        } else {
            System.out.println("O avião não está parado \n");
        }
    }
}
