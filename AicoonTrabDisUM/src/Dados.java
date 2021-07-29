import java.util.ArrayList;
import java.util.List;

public class Dados{

    private String email;
    private String nome;
    private Number senha;
    private int indiceUsuario = -1;
    private List<String> emails = new ArrayList<>();
    private List<String> nomes = new ArrayList<>();
    private List<String> senhas = new ArrayList<>();

    // Comunidades
    private List<String> comunidades = new ArrayList<>();
    private List<String> privacidade = new ArrayList<>();
    private List<String> temas = new ArrayList<>();
    private boolean logou = false;

    public void criarComunidade(String nomeDaComunidade, String privacidade, String temasDaComunidade){
        this.comunidades.add(nomeDaComunidade);
        this.privacidade.add(privacidade);
        this.temas.add(temasDaComunidade);
    }

    public void getComunidades(){
        for (int i = 0; i < comunidades.size(); i++){
            System.out.printf("Comunidade Número (%s)\n", i);
            System.out.println("Nome:");
            System.out.println(this.comunidades.get(i));
            System.out.println("Privacidade:");
            System.out.println(this.privacidade.get(i));
            System.out.println("Temas:");
            System.out.println(this.temas.get(i));
            System.out.println("---------------");
        }
    }

    public boolean getLogin(){
        if (!this.logou) {
            return false;
        } else {
            return true;
        }
    }

    public void criarConta(String emailDaConta, String nomeDaConta, String senhaDaConta) {
        this.emails.add(emailDaConta);
        this.nomes.add(nomeDaConta);
        this.senhas.add(senhaDaConta);
    }

    public void lista(){
        for(int i = 0; i < this.emails.size(); i++) {
            System.out.printf("Indice %s\n", (i + 1));
            System.out.println(this.emails.get(i));
            System.out.println(this.nomes.get(i));
            System.out.println(this.senhas.get(i));
            System.out.println("---------------");
        }
    }

    public boolean logar(String emailnome, String senha) {
        for(int i = 0; i < this.emails.size(); i++) {
            if(this.emails.get(i).equals(emailnome) || this.nomes.get(i).equals(emailnome)) {
                if(this.senhas.get(i).equals(senha)) {
                    this.indiceUsuario = i;
                    this.logou = true;
                    return true;
                }
            }
        }
        return false;
    }

    public void deslogar(){
        this.indiceUsuario = -1;
        this.logou = false;
    }

    public boolean getTamanho(){
        if(this.emails.size() == 0){
            return false;
        }
        return true;
    }

    public String getName(){
        return nomes.get(this.indiceUsuario);
    }

}