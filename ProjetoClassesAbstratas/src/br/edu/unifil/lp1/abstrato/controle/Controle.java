package br.edu.unifil.lp1.abstrato.controle;

import br.edu.unifil.lp1.abstrato.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    ArrayList<Funcionario> listaEmp = new ArrayList();
    Scanner teclado = new Scanner(System.in);

    private String stringDescartavel = "teste";
    private float valorDescartavelFloat = 0;
    private int valorDescartavelInt = 0;
    private int aux = 0;

    public int getIndexArrayMatricula(int matricula) {
        for (aux = 0; aux < listaEmp.size(); aux++) {
            if (listaEmp.get(aux).getMatricula() == matricula) {
                return aux;
            }
        }
        return -1;
    }

    public int getIndexArrayNome(String nome) {
        for (aux = 0; aux < listaEmp.size(); aux++) {
            if (listaEmp.get(aux).getNome().equals(nome)) {
                return aux;
            }
        }
        return -1;
    }

    public void cadastrarFuncionario(int tipoFuncionario) {
        switch (tipoFuncionario) {
            case 1:
                System.out.println("| Qual o nome do funcionário?");
                stringDescartavel = teclado.next();
                listaEmp.add(new Mensalista(stringDescartavel, valorDescartavelInt, valorDescartavelFloat));
                System.out.println("| Qual a matricula do funcionário?");
                valorDescartavelInt = teclado.nextInt();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setMatricula(valorDescartavelInt);
                System.out.println("| Qual o salário do funcionário?");
                valorDescartavelFloat = teclado.nextFloat();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setSalario(valorDescartavelFloat);

                System.out.printf("Funcionário Mensalista %s cadastrado com sucesso! \n", listaEmp.get(getIndexArrayNome(stringDescartavel)).getNome());

                break;
            case 2:
                System.out.println("| Qual o nome do funcionário?");
                stringDescartavel = teclado.next();
                listaEmp.add(new Comissionado(stringDescartavel, valorDescartavelInt, valorDescartavelFloat, valorDescartavelFloat, valorDescartavelInt));
                System.out.println("| Qual a matricula do funcionário?");
                valorDescartavelInt = teclado.nextInt();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setMatricula(valorDescartavelInt);
                System.out.println("| Qual o salário do funcionário?");
                valorDescartavelFloat = teclado.nextFloat();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setSalario(valorDescartavelFloat);

                System.out.printf("Funcionário Comissionado %s cadastrado com sucesso! \n", listaEmp.get(getIndexArrayNome(stringDescartavel)).getNome());

                break;
            case 3:
                System.out.println("| Qual o nome do funcionário?");
                stringDescartavel = teclado.next();
                listaEmp.add(new Horista(stringDescartavel, valorDescartavelInt, valorDescartavelFloat, valorDescartavelInt));
                System.out.println("| Qual a matricula do funcionário?");
                valorDescartavelInt = teclado.nextInt();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setMatricula(valorDescartavelInt);
                System.out.println("| Qual o salário do funcionário?");
                valorDescartavelFloat = teclado.nextFloat();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setSalario(valorDescartavelFloat);

                System.out.printf("Funcionário Horista %s cadastrado com sucesso! \n", listaEmp.get(getIndexArrayNome(stringDescartavel)).getNome());

                break;
            case 4:
                System.out.println("| Qual o nome do funcionário?");
                stringDescartavel = teclado.next();
                listaEmp.add(new Producao(stringDescartavel, valorDescartavelInt, valorDescartavelFloat, valorDescartavelInt));
                System.out.println("| Qual a matricula do funcionário?");
                valorDescartavelInt = teclado.nextInt();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setMatricula(valorDescartavelInt);
                System.out.println("| Qual o salário do funcionário?");
                valorDescartavelFloat = teclado.nextFloat();
                listaEmp.get(getIndexArrayNome(stringDescartavel)).setSalario(valorDescartavelFloat);

                System.out.printf("Funcionário Produção %s cadastrado com sucesso! \n", listaEmp.get(getIndexArrayNome(stringDescartavel)).getNome());

                break;
            default:

                break;
        }
    }

    public String listaFuncionario() {
        for (aux = 0; aux < listaEmp.size(); aux++) {
            return "| Nome: " + listaEmp.get(aux).getNome() + "| Matrícula: " + listaEmp.get(aux).getMatricula() + "| Ganho Mensal:" + listaEmp.get(aux).getGanhoMensal();
        }
        return "Nenhum Funcionário Cadastrado!";
    }

    public Funcionario getFuncionario(int matricula) {
        if (getIndexArrayMatricula(matricula) == -1) {
            return null;
        } else {
            return listaEmp.get(getIndexArrayMatricula(matricula));
        }
    }

    public void excluiFuncionario(Funcionario funcionario) {
        if (listaEmp.get(getIndexArrayMatricula(funcionario.getMatricula())) == null) {
            System.out.println("Não encontrado");
        } else {
            listaEmp.remove(getFuncionario(funcionario.getMatricula()));
        }
    }
}
