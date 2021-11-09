import java.util.Scanner;

public class Numeros {
    private int[] numeros;
    private Scanner teclado;

    //construtor
    public Numeros(int tamanho){
        numeros = new int[tamanho];
        teclado = new Scanner(System.in);
    }

    public void carregaNumeros() {
        System.out.println("Informe os números:");
        for (int indice = 0; indice < numeros.length; indice++ ){
            numeros[indice] = teclado.nextInt();
        }
    }

    public String mostraNumeros() {
        //retorne os números armazenados no array em formato de linha. Os números devem ser separados por vírgula, exemplo: 22, 3, 5, 11, 224.

        String numerosEmLinha = "";
        for (int i = 0; i < this.numeros.length; i++) {
            if(i == this.numeros.length - 1) {
                numerosEmLinha += this.numeros[i] + ".";
            } else {
                numerosEmLinha += this.numeros[i] + ", ";
            }
        }

        return numerosEmLinha;
    }

    public int maiorNumero(){
        //retorne o maior número armazenado no array
        int maiorNumero = this.numeros[0];

        for (int numero : this.numeros) {
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int[] mostraParImpar(int tipo){
        //retorne um array contendo os números pares ou ímpares de acordo com o atributo tipo. Considere tipo = 1 (par) e tipo = 2 (ímpar).

        int[] arrayRetorno = new int[this.numeros.length];
        int qtdNumeroEncontrados = 0;

        for (int i = 0; i < this.numeros.length; i++) {
            if(tipo == 1 && this.numeros[i] % 2 == 0) {
                arrayRetorno[qtdNumeroEncontrados] = this.numeros[i];
                qtdNumeroEncontrados++;
            } else if(tipo == 2 && this.numeros[i] % 2 != 0) {
                arrayRetorno[qtdNumeroEncontrados] = this.numeros[i];
                qtdNumeroEncontrados++;
            }
        }

        return arrayRetorno;
    }

    public void alteraNumero(int indice, int novoValor){
        //método para alterar um valor armazenado no array
        try {
            this.numeros[indice] = novoValor;
            System.out.println("Valor alterado com sucesso para " + novoValor + ".");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("O índice não foi encontrado.");
        }
    }



    //analise e faça os devidos tratamentos de exceção
}