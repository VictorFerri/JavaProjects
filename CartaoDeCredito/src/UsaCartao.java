import java.util.Scanner;

public class UsaCartao {

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(123123123, "Visa");
        Scanner teclado = new Scanner(System.in);
        int opcaoPessoa = 0;
        int menuRodar = 1;


        do {
            System.out.print("          ##--Cartão--##         \n");
            System.out.print("|-------------------------------|\n");
            System.out.print("| Opção 1 - Atualizar bandeira  |\n");
            System.out.print("| Opção 2 - Atualizar limite    |\n");
            System.out.print("| Opção 3 - Comprar             |\n");
            System.out.print("| Opção 4 - Pagar               |\n");
            System.out.print("| Opção 5 - Consulta cartão     |\n");
            System.out.print("| Opção 9 - Encerrar o programa |\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcaoPessoa = teclado.nextInt();
            switch (opcaoPessoa) {
                case 1:
                    String novaBandeira;
                    System.out.println("Digite a nova bandeira:");
                    novaBandeira = teclado.next();
                    cartao.setBandeira(novaBandeira);
                    System.out.println("Bandeira Atualizada com Sucesso!");
                    break;
                case 2:
                    int novoLimite;
                    System.out.println("Digite a novo limite:");
                    novoLimite = teclado.nextInt();
                    cartao.setLimite(novoLimite);
                    System.out.println("Limite Atualizado com Sucesso!");
                    break;
                case 3:
                    int valorASePagar;
                    System.out.println("Digite o valor a se pagar:");
                    valorASePagar = teclado.nextInt();
                    cartao.addPagar(valorASePagar);
                    System.out.println("Pagamento Realizado com Sucesso!");
                    break;
                case 4:
                    int valorDaCompra;
                    System.out.println("Digite o valor a se pagar:");
                    valorDaCompra = teclado.nextInt();
                    cartao.addComprar(valorDaCompra);
                    System.out.println("Compra realizada com Sucesso!");
                    break;
                case 5:
                    System.out.println("----------------------");
                    System.out.printf("Bandeira: %s \n", cartao.getBandeira());
                    System.out.printf("Bônus: %s \n", cartao.getBonus());
                    System.out.printf("Limite do Cartão: %s \n", cartao.getLimite());
                    System.out.printf("Saldo do Cartão: %s \n", cartao.getSaldo());
                    System.out.printf("Nûmero do Cartão: %s \n", cartao.getNumero());
                    System.out.println("----------------------");
                    break;

                case 9:
                    menuRodar = 0;
                    System.out.println("Obrigado por usar s2");
                    break;
            }
        } while (menuRodar == 1);
    }
}
