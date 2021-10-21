import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaArray{
    private Scanner teclado;

    public UsaArray(){
    teclado = new Scanner(System.in);
    }

    public void carregaArray(int arr[]) throws InputMismatchException {                               //1) implemente try..catch
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Informe Numero: ");
            arr[i] = teclado.nextInt();
        }
    }

    public String mostraArray(int arr[]){
        String saida = "";
            for(int i=0; i<arr.length; i++){
                saida = saida + arr[i] + '\n';
            }
        return saida;
    }

    public int[] geraArrayDivisao(int arrA[],int arrB[]){               //2) implemente try..catch
        int aux[] = new int[arrA.length];
        for(int i=0; i<arrA.length; i++){
             try {
                aux[i] = arrA[i] / arrB[i];
            } catch (ArithmeticException e){
                System.out.println("Não é possivel fazer uma divisao por zero ! ");
                System.exit(0);
            }
        }
        return aux;
    }

    public void atualizaArray(int arr[], int posicao, int novoValor) {
        if (posicao < 0) {
            throw new IllegalArgumentException("Valor de posição incorreta ou não encontrada.");

        } else {
            arr[posicao] = novoValor;
        }

    }

}