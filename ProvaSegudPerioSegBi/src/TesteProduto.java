import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) throws ParametrosNulos, ForaDeEstoque {
        ListaProduto listaProduto = new ListaProduto();
        Scanner teclado = new Scanner(System.in);
        listaProduto.addProduto(new Produto("notebook", 10));
        listaProduto.addProduto(new Produto("teclado", 5));
        listaProduto.addProduto(new Produto("mouse", 3));

        int opc = 1;
        int aux;
        String descricao = "";
        double qtde = 0;


        while (opc == 1) {
            System.out.println("                                   ");
            System.out.println("---------------Menu---------------");
            System.out.println("(1) Alterar descrição de um produto");
            System.out.println("(2) Registrar venda                ");
            System.out.println("(3) Listar estoque                 ");
            System.out.println("(9) Sair                           ");
            System.out.println("");
            System.out.println("Selecione:");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Escolha um produto para alterar: ");
                    for(int i = 0; i < listaProduto.getLista().size(); i++) {
                        System.out.printf("(%s) %s \n", i, listaProduto.getLista().get(i).getDescricao());
                    }
                    opc = teclado.nextInt();

                    System.out.println("Informe a nova descrição do produto: ");
                    descricao = teclado.next();

                    listaProduto.getLista().get(opc).setDescricao(descricao);

                    System.out.println("Descrição do produto alterada para " + descricao);

                    opc = 1;
                    break;

                case 2:
                    System.out.println("Escolha um produto para alterar: ");
                    for(int i = 0; i < listaProduto.getLista().size(); i++) {
                        System.out.printf("(%s) %s \n", i, listaProduto.getLista().get(i));
                    }
                    opc = teclado.nextInt();

                    System.out.println("Informe a quantidade vendida do produto: ");
                    qtde = teclado.nextDouble();

                    listaProduto.getLista().get(opc).saidaProduto(qtde);

                    System.out.println(qtde + " produtos vendidos.");

                    opc = 1;
                    break;

                case 3:

                    System.out.println(listaProduto.getProdutosDescricao(listaProduto.getLista()));

                    opc = 1;
                    break;

                case 9:

                    System.out.println("Programa encerrado.");
                    opc = 0;
                    break;

                default:
                    break;
            }
        }
    }
}