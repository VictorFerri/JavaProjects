public class Produto {
    private String descricao;
    private double saldo;

    public Produto(String descricao, int i) throws ParametrosNulos {
        setDescricao(descricao);
        this.saldo = i;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ParametrosNulos {
        if(descricao == null) {
            throw new ParametrosNulos("A descrição não pode ser nula!");
        } else {
            this.descricao = descricao;
        }
    }

    public void saidaProduto(double qtde) throws ForaDeEstoque {
        if(qtde > this.saldo) {
            throw new ForaDeEstoque("");
        } else {
            this.saldo = this.saldo - qtde;
        }
    }
}
