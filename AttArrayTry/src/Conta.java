public class Conta {
    private float saldo;
    private int numero;

    public Conta(float newSaldo, int newNumero) {
        this.saldo = newSaldo;
        this.numero = newNumero;
    }

    public void setNumero(int newNumero) {
        if (newNumero > 10000 || newNumero < 0) {
            System.out.println("Número colocado inválido!");
            throw new IllegalArgumentException("Número inválido!");
        } else {
            this.numero = newNumero;
        }
    }

    public void saque(float valorParaSacar) {
        if (valorParaSacar > saldo) {
            System.out.println("Saldo insuficiente!");
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else {
            this.saldo -= valorParaSacar;
        }
    }

    public void deposito(float valorParaDepositar) {
        if (valorParaDepositar < 0) {
            System.out.println("Valor inválido!");
            throw new IllegalArgumentException("Valor inválido!");
        } else {
            this.saldo += valorParaDepositar;
        }
    }

    public float getSaldo() {
        return saldo;
    }
}
