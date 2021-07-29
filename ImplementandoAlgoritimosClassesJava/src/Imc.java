import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Double altura, peso, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Peso:");
        peso = teclado.nextDouble();
        System.out.println("Altura:");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println(imc + " Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9){
            System.out.println(imc + " Peso normal");
        } else if (imc >= 24.9 && imc < 29.9){
            System.out.println(imc + " Sobrepeso");
        } else {
            System.out.println(imc + " Obeso");
        }
    }
}
