import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaPessoa = new Conta(1000, 1234);
        Scanner teclado = new Scanner(System.in);

        int opcaoPessoa = 0;

        while (opcaoPessoa == 0) {
            System.out.println("|--------------#Menu#--------------|");
            System.out.println("|1 - Sacar:                        |");
            System.out.println("|2 - Depositar:                    |");
            System.out.println("|3 - Alterar Número                |");
            System.out.println("|4 - Ver Saldo                     |");
            System.out.println("|9 - fim                           |");
            System.out.println("");
            System.out.println("Selecione uma Opção:");
            opcaoPessoa = teclado.nextInt();

            switch (opcaoPessoa) {
                case 1:
                    float sacar;
                    System.out.println("Qual o valor que deseja sacar? \b");
                    sacar = teclado.nextFloat();
                    contaPessoa.saque(sacar);

                    System.out.printf("O Valor de ( %s ) foi retirado! \b", sacar);
                    opcaoPessoa = 0;

                    break;
                case 2:
                    float depositar;
                    System.out.println("Qual o valor que deseja depositar? \b");
                    depositar = teclado.nextFloat();
                    contaPessoa.deposito(depositar);

                    System.out.printf("O Valor de ( %s ) foi depositado! \b", depositar);
                    opcaoPessoa = 0;

                    break;
                case 3:
                    int newNumero;
                    System.out.println("Qual o número que deseja colocar? \b");
                    newNumero = teclado.nextInt();
                    contaPessoa.setNumero(newNumero);

                    System.out.printf("O número foi alterado para ( %s ) com sucesso! \b", newNumero);
                    opcaoPessoa = 0;

                    break;
                case 4:
                    System.out.printf("|Saldo Atual: ( %s ) \b", contaPessoa.getSaldo());
                    opcaoPessoa = 0;

                    break;
                case 9:
                    System.out.println("Obrigado por usar s2");
                    opcaoPessoa = 1;
                    break;
            }
        }
    }
}
