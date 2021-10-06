import java.util.InputMismatchException;
import java.util.Scanner;
public class Try2

{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int a = 0;
        int cont = 0;

        do{
            System.out.print("A: ");
            // 1) faça o tratamento de exceção e utilize os métodos getMessage() e printStackTrace();
            try {
                a = teclado.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                a = 0;
            } finally {
                cont++;
            }

        }while(a > 0);

        System.out.println("Quantidade de entrada de dados: " + cont);
        //2) Faça o cont++ para incrementar todas as entradas de dados corretas e incorretas em uma única linha de código.
    }
}