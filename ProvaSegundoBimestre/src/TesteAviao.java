import java.util.Scanner;

public class TesteAviao {
    public static void main(String[] args) {
        Aviao usaAviao = new Aviao(200);
        Scanner teclado = new Scanner(System.in);
        int rodaMenu = 0;
        int opcaoPessoa = 0;
        do {
            System.out.print("               ##--Avião--##              \n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("| Opção 1 - Pousar                       |\n");
            System.out.print("| Opção 2 - Decolar                      |\n");
            System.out.print("| Opção 3 - Alterar nome do voo          |\n");
            System.out.print("| Opção 4 - Alterar Max. de Passageiros  |\n");
            System.out.print("| Opção 5 - Embarcar                     |\n");
            System.out.print("| Opção 6 - Desembarcar                  |\n");
            System.out.print("| Opção 7 - Constuar Informações         |\n");
            System.out.print("| Opção 9 - Encerrar o programa          |\n");
            System.out.print("|----------------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcaoPessoa = teclado.nextInt();
            switch (opcaoPessoa){
                case 1:
                    usaAviao.pousar();
                    break;
                case 2:
                    usaAviao.decolar();
                    break;
                case 3:
                    teclado.nextLine();
                    String novoNome;
                    System.out.println("Digite o novo nome:");
                    novoNome = teclado.next();
                    usaAviao.setNomeVoo(novoNome);

                    break;
                case 4:
                    int novoMaximo;
                    System.out.println("Digite a nova quantidade máxima:");
                    novoMaximo = teclado.nextInt();
                    usaAviao.setQuantidadeMaxima(novoMaximo);
                    break;
                case 5:
                    usaAviao.embarcar();
                    break;
                case 6:
                    usaAviao.desembarcar();
                    break;
                case 7:
                    System.out.println("----------------------");
                    System.out.printf("Estado do Avião: %s \n", usaAviao.getEstado());
                    System.out.printf("Nome do Voo: %s \n", usaAviao.getNomeVoo());
                    System.out.printf("Quant. Max de passageiros: %s \n", usaAviao.getQuantidadeMaxima());
                    System.out.printf("Quant. De Passageiros: %s \n", usaAviao.getQuantidadePassagueiros());
                    System.out.println("----------------------");
                    break;
                case 9:
                    rodaMenu = 1;
                    System.out.println("Obrigado por usar s2");
                    break;
            }

        } while (rodaMenu == 0);
    }
}
