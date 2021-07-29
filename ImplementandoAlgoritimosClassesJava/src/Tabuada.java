import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        String resposta = "s";
        Scanner teclado = new Scanner(System.in);
        int tabuada;

        do {
            System.out.println("Tabuada:");
            tabuada = teclado.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.printf("%s x %s = %s\n", tabuada, i, tabuada * i );
            }

            System.out.println("Deseja continuar?:");
            resposta = teclado.next();

        } while ((resposta.equals("s")));

        System.out.println("Fim, obrigado por usar s2");
    }
}
