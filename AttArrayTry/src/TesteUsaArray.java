import java.util.Scanner;

public class TesteUsaArray{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int a[] = new int[5];
    int b[] = new int[5];
    int c[] = new int[5];
    int opcaoPessoa = 0;
    UsaArray usaArrays = new UsaArray();

    while (opcaoPessoa != 9){
        System.out.println("|--------------#Menu#--------------|");
        System.out.println("|1 - Atualizar o array A:          |");
        System.out.println("|2 - Atualizar o array B:          |");
        System.out.println("|3 - Mostrar o array A             |");
        System.out.println("|4 - Mostrar o array B             |");
        System.out.println("|5 - Mostrar o array C             |");
        System.out.println("|6 - Gerar o Array C para divisão  |");
        System.out.println("|9 - fim                           |");
        System.out.println("");                                                         //3)implemente try..catch
        opcaoPessoa = teclado.nextInt();

        switch(opcaoPessoa){
            case 1 :                                                            //4) invocar o método carregaArray()
                usaArrays.carregaArray(a);
                break;
            case 2 :                                                            //5) invocar o método carregaArray()
                usaArrays.carregaArray(b);
                break;
            case 3 :                                                            //6) invocar o método mostraArray() e mostrar os números do array A
                System.out.println(usaArrays.mostraArray(a));
                break;
            case 4 :                                                            //7) invocar o método mostraArray() e mostrar os números do array B
                System.out.println(usaArrays.mostraArray(b));
                break;
            case 5 :                                                            //8) invocar o método mostraArray() e mostrar os números do array C
                System.out.println(usaArrays.mostraArray(c));
                break;
            case 6 :                                                            //9) invocar o método geraArrayDivisao() para carregar o array C
                c = usaArrays.geraArrayDivisao(a, b);
                break;
            case 9 :
                System.out.println("Obrigado por usar s2.");
                break;
            default:
                System.out.println("Opção inválida");
            }
        }
    }
}
