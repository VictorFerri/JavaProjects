import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try1

{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];


        /* 1) faça um try..catch para tratar a entrada de dados do array a*/
        for (int i = 0; i < a.length; i++) {
            System.out.print("A: ");
            try {
                a[i] = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Erro na entrada de .");
                System.exit(0);
            }

        }

        /* 2) Após testar o item 1, altere o catch para utilizar a exceção generica */

        /* 3) faça um try com catch para tratar a entrada de dados do array b e divisão por zero */
        for (int i = 0; i < a.length; i++) {
            System.out.print("B: ");
            try {
                b[i] = teclado.nextInt();
                c[i] = a[i] / b[i];
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero.");
            } catch (InputMismatchException e) {
                System.out.println("Erro na entrada de Dados.");
            }
        }


        /* 4) Que exceções podem ocorrer no trecho abaixo? Se for informado 5 na entrada de dados o que acontece?
         *    Faça o tratamento de exceção. */
        int indice;
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe o indice para consultar um valor no array c:");
            try {
                indice = teclado.nextInt();
                System.out.println(c[indice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice Inválido");
            } catch (InputMismatchException e) {
                System.out.println("Erro na entrada de Dados.");
            }
        }
    }
}
