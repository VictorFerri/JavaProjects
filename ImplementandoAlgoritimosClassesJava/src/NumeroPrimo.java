import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int entrada, loop;
        int quantdiv = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número:");
        entrada = teclado.nextInt();

        for (loop = 1; loop <= entrada; loop++){
            if (entrada % loop == 0){
                System.out.println(entrada + " é divisivel por " + loop);
                quantdiv += 1;
            }
        }
        if  (quantdiv == 2){
            System.out.println(entrada + " É um número primo");
        }
        else{
            System.out.println(entrada + " Não é um número primo");
        }

    }
}
