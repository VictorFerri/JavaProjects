import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCartao {
    public static void main(String[] args) {
        ArrayList<CartaoCredito> cartoes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcaoPessoa = 0;
        int rodaMenu = 0;
        int i = 0;

        do {
            System.out.print("              ##--Cartão--##               \n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastrar cartão              |\n");
            System.out.print("| Opção 2 - Consultar cartão por número   |\n");
            System.out.print("| Opção 3 - Consultar cartão por bandeira |\n");
            System.out.print("| Opção 4 - Comprar com um cartão         |\n");
            System.out.print("| Opção 5 - Pagar um cartão               |\n");
            System.out.print("| Opção 9 - Fim                           |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa){
                case 1:
                    int novoCartaoNumero;
                    String novoCartaoBandeira;
                    int novoCartaolimite;
                    int verificarNumeroExistente = 1;
                    do {
                        System.out.println("Digite o Número do cartão");
                        novoCartaoNumero = teclado.nextInt();
                        for(i = 0; i < cartoes.size(); i++) {
                            if(cartoes.get(i).getNumero() == novoCartaoNumero) {
                                verificarNumeroExistente = 0;
                                System.out.println("Erro, um cartão já está registrado com esse número.");
                            } else {
                                verificarNumeroExistente = 1;
                            }
                        }
                    } while ( verificarNumeroExistente == 0);


                    System.out.println("Digite a Bandeira do cartão");
                    teclado.nextLine();

                    novoCartaoBandeira = teclado.nextLine();
                    System.out.println("Digite o Limite do cartão(0 caso não queira)");
                    novoCartaolimite = teclado.nextInt();

                    if (novoCartaolimite == 0){
                        CartaoCredito cartaoCreditoNovo = new CartaoCredito(novoCartaoNumero, novoCartaoBandeira);
                        cartoes.add(cartaoCreditoNovo);
                        System.out.printf("Cartão de %s cadastrado com sucesso!!", novoCartaoNumero);
                    } else{
                        CartaoCredito cartaoCreditoNovo = new CartaoCredito(novoCartaoNumero, novoCartaoBandeira, novoCartaolimite);
                        cartoes.add(cartaoCreditoNovo);
                        System.out.printf("Cartão de %s cadastrado com sucesso!!", novoCartaoNumero);
                    }

                    break;
                case 2:
                    boolean achouCartaoProcuraNumero = false;
                    int procuraNumeroCartao;

                    System.out.println("Digite o número do cartão a ser procurado:");
                    procuraNumeroCartao = teclado.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if(cartoes.get(i).getNumero() == procuraNumeroCartao) {
                            System.out.println("----------------------");
                            System.out.printf("Bandeira: %s \n", cartoes.get(i).getBandeira());
                            System.out.printf("Bônus: %s \n", cartoes.get(i).getBonus());
                            System.out.printf("Limite do Cartão: %s \n", cartoes.get(i).getLimite());
                            System.out.printf("Saldo do Cartão: %s \n", cartoes.get(i).getSaldo());
                            System.out.printf("Nûmero do Cartão: %s \n", cartoes.get(i).getNumero());
                            System.out.println("----------------------");
                            achouCartaoProcuraNumero = true;
                        }
                    }
                    if (achouCartaoProcuraNumero = false){
                        System.out.println("Cartão não encontrado, tente novamente por favor.");
                    }
                    break;
                case 3:
                    boolean mostrouUmCartao = false;
                    String procuraBandeiraCartao;

                    System.out.println("Digite a bandeira do cartão a ser procurado:");
                    procuraBandeiraCartao = teclado.next();

                    for(i = 0; i < cartoes.size(); i++) {
                        if (cartoes.get(i).getBandeira().equals(procuraBandeiraCartao)) {
                            System.out.println("----------------------");
                            System.out.printf("CARTÃO NUMERO: %s", i + 1);
                            System.out.printf("Bandeira: %s \n", cartoes.get(i).getBandeira());
                            System.out.printf("Bônus: %s \n", cartoes.get(i).getBonus());
                            System.out.printf("Limite do Cartão: %s \n", cartoes.get(i).getLimite());
                            System.out.printf("Saldo do Cartão: %s \n", cartoes.get(i).getSaldo());
                            System.out.printf("Nûmero do Cartão: %s \n", cartoes.get(i).getNumero());
                            System.out.println("----------------------");
                            mostrouUmCartao = true;
                        }
                    }

                    if (mostrouUmCartao = false){
                        System.out.println("Esta bandeira não existe, tente novamente por favor.");
                    }

                    break;
                case 4:
                    boolean achouCartaoCompra = false;
                    int numeroCompraCartao;

                    System.out.println("Digite o número do cartão:");
                    numeroCompraCartao = teclado.nextInt();

                    System.out.println("Digite o valor da compra:");
                    float valorCompra;
                    valorCompra = teclado.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if (cartoes.get(i).getNumero() == numeroCompraCartao) {
                            cartoes.get(i).addComprar(valorCompra);
                            achouCartaoCompra = true;
                        }
                    }
                    if (achouCartaoCompra == false){
                        System.out.println("Cartão não encontrado, tente novamente por favor.");
                    }

                    break;
                case 5:
                    boolean achouCartaoPagar = false;
                    int numeroPagarCartao;

                    System.out.println("Digite o número do cartão");
                    numeroPagarCartao = teclado.nextInt();

                    System.out.println("Digite o valor a se pagar:");
                    float valorAPagar;
                    valorAPagar = teclado.nextInt();

                    for(i = 0; i < cartoes.size(); i++) {
                        if (cartoes.get(i).getNumero() == numeroPagarCartao) {
                            cartoes.get(i).addPagar(valorAPagar);
                            achouCartaoPagar = true;
                        }
                    }

                    if (achouCartaoPagar == false){
                        System.out.println("Cartão não econtrado, tente novamente por favor.");
                    }

                    break;
                case 9:
                    System.out.println("Obrigado por usar s2.");
                    rodaMenu = 1;

                    break;
                default:
                    System.out.println("comando inválido");

                    break;

            }
        } while (rodaMenu == 0);
    }
}