import java.util.ArrayList;
import java.util.Collection;

public class ListaProduto {
    ArrayList<Produto> lista;

    public ListaProduto() {
        lista = new ArrayList<Produto>();
    }

    public void addProduto(Produto prod) {
        lista.add(prod);
    }

    public ArrayList<String> getProdutosDescricao(ArrayList<Produto> lista) {
        ArrayList<String> aux = new ArrayList<>();
        for(int i = 0; i < this.lista.size(); i++) {
            aux.add(this.lista.get(i).getDescricao());
        }

        for(int i = 0; i < lista.size(); i++) {
            aux.add(lista.get(i).getDescricao());
        }

        return aux;
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }
}
