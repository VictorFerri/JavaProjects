public class Professor {

    private String nome;
    private int matricula;

    public Professor(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String atualizarNome){
        if (atualizarNome.equals("")){
            System.out.println("Por favor digite um nome!");
        } else if (atualizarNome.isBlank()){
            System.out.println("Por favor digite um nome!");
        } else{
            this.nome = atualizarNome;
        }

    }

    public String getNome(){
        return this.nome;
    }
}
