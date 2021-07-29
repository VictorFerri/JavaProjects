import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcaoPessoa;
        Dados contas = new Dados();
        int z = 0;


        do {
            // ! para retornar falso
            if(!contas.getLogin()) {
                System.out.print("          ##--Menu--##         \n");
                System.out.print("|-----------------------------|\n");
                System.out.print("| Opção 1 - Logar             |\n");
                System.out.print("| Opção 2 - Novo Cadastro     |\n");
                System.out.print("| Opção 3 - Sair              |\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("Digite uma opção: ");

                opcaoPessoa = teclado.nextInt();

                switch (opcaoPessoa) {
                    case 1:
                        int y = 0;
                        String emailNome;
                        if (contas.getTamanho()) {
                            do {
                                System.out.print("Informe o email ou o nome da conta: ");

                                emailNome = teclado.next();

                                System.out.print("Informe a senha da conta: ");
                                String senhaVerificar;
                                senhaVerificar = teclado.next();

                                if (contas.logar(emailNome, senhaVerificar)) {
                                    y = 1;
                                } else {
                                    System.out.println("Falha no Login, verifique as informações!\n");
                                    System.out.println("Informe novamente: ");
                                }

                            } while (y == 0);
                            System.out.printf("Logado(a) com sucesso!! Bem vindo(a) %s \n", emailNome);
                            contas.getLogin();

                        } else {
                            System.out.println("Nenhuma conta cadastrada.");
                        }

                        break;
                    case 2:
                        System.out.print("\nInforme o email da conta: ");
                        String email;
                        email = teclado.next();

                        System.out.print("\nInforme o nome de usuário da conta: ");
                        String nome;
                        nome = teclado.next();

                        System.out.print("\nInforme a senha da conta: ");
                        String senha;
                        senha = teclado.next();

                        int x = 0;
                        do {
                            System.out.print("\nConfirme a senha: ");
                            String senhaConfirma = teclado.next();

                            if (senhaConfirma.equals(senha)) {
                                x = 1;
                            }

                        } while (x == 0);

                        contas.criarConta(email, nome, senha);
                        System.out.printf("Conta de %s Cadastrada!\n", nome);
                        break;

                    case 3:
                        System.out.print("\nAté logo, obrigado por usar S2\n");
                        z = 1;
                        break;

                    default:
                        System.out.print("\nOpção Inválida!");
                        break;
                }
            } else{
                System.out.printf("          ##--%s--##           \n", contas.getName());
                System.out.print("|-----------------------------|\n");
                System.out.print("| Opção 1 - Comunidades       |\n");
                System.out.print("| Opção 2 - Criar Comunidade  |\n");
                System.out.print("| Opção 3 - Deslogar          |\n");
                System.out.print("| Opção 4 - Sair              |\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("Digite uma opção: ");

                opcaoPessoa = teclado.nextInt();
                String nome;
                String privacidade;
                String temas;
                switch (opcaoPessoa){
                    case 1:
                        System.out.println("As comunidades disponíveis são:");
                        contas.getComunidades();
                        break;
                    case 2:
                        teclado.nextLine();
                        System.out.printf("Digite o nome da sua comunidade: ");
                        nome = teclado.nextLine();

                        int a = 0;

                        do {
                            System.out.printf("Digite a privacidade da sua comunidade: ");
                            privacidade = teclado.nextLine();

                            if (privacidade.equals("pública") || privacidade.equals("privada")){
                                a = 1;
                            } else {
                                System.out.println("Inválido, digite 'pública' ou 'privada'");
                            }
                        } while (a == 0);

                        System.out.printf("Digite os temas da sua comunidade: ");
                        temas = teclado.nextLine();

                        contas.criarComunidade(nome, privacidade, temas);

                        break;
                    case 3:
                        contas.deslogar();
                        break;
                    case 4:
                        z = 1;
                        break;
                }

            }
        } while (z == 0);
    }
}