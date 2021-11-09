import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Numeros controle = null;
        int opc = 1;
        while (opc == 1) {
            System.out.println("--------------Menu--------------");
            System.out.println("1- Criar array                  ");
            System.out.println("2- Carregar array               ");
            System.out.println("3- Mostrar números              ");
            System.out.println("4- Mostrar maior número    	    ");
            System.out.println("5- Mostrar números par ou ímpar ");
            System.out.println("6- Alterar um número            ");
            System.out.println("9- Sair                         ");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Escolha:");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    if(controle instanceof Numeros) {
                        System.out.println("O array já foi criado.");
                    } else {
                        System.out.println("Informe o tamanho do array:");
                        opc = teclado.nextInt();
                        if (opc < 0) {
                            throw new NegativeArraySizeException("O tamanho do array não pode ser negativo.");
                        }
                        controle = new Numeros(opc);

                        System.out.println("Array criado com sucesso.");
                    }

                    opc = 1;
                    break;
                case 2:
                    if(controle instanceof Numeros) {
                        controle.carregaNumeros();
                    } else {
                        System.out.println("O array ainda não foi criado.");
                    }

                    opc = 1;
                    break;
                case 3:
                    if(controle instanceof Numeros) {
                        String numerosEmLinha = controle.mostraNumeros();
                        System.out.println("Os números do array são: " + numerosEmLinha);
                    } else {
                        System.out.println("O array ainda não foi criado.");
                    }

                    opc = 1;
                    break;
                case 4:
                    if(controle instanceof Numeros) {
                        int maiorNumero = controle.maiorNumero();
                        System.out.println("O maior número do array é " + maiorNumero + ".");
                    } else {
                        System.out.println("O array ainda não foi criado.");
                    }

                    opc = 1;
                    break;
                case 5:
                    if(controle instanceof Numeros) {
                        System.out.println("Informe 1 para números pares e 2 para números ímpares:");
                        opc = teclado.nextInt();
                        System.out.println("Os números são: " + Arrays.toString(controle.mostraParImpar(opc)));
                    } else {
                        System.out.println("O array ainda não foi criado.");
                    }

                    opc = 1;
                    break;
                case 6:
                    if(controle instanceof Numeros) {
                        System.out.println("Informe o índice do número a ser alterado:");
                        int indice = 0;
                        teclado.nextLine();
                        indice = teclado.nextInt();

                        int novoValor = 0;
                        System.out.println("Informe o novo valor desse número:");
                        novoValor = teclado.nextInt();

                        controle.alteraNumero(indice, novoValor);
                    } else {
                        System.out.println("O array ainda não foi criado.");
                    }

                    opc = 1;
                    break;
                case 9:
                    System.out.println("Obrigado por usar s2");
                    opc = 0;
                    break;
                default:
                    break;
            }
        }
    }
}
