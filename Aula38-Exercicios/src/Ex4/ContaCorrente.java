package Ex4;

import java.math.BigDecimal;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public double depositarConta(double valor, ContaCorrente conta){
        double valorAtualizado = (conta.getSaldo() + valor);
        setSaldo(valorAtualizado);
        System.out.println("Depósito realizado, saldo atualizad: "+getSaldo());

        return valorAtualizado;
    }

    public void sacar(double valor){
        if (getSaldo() < 5){
            System.out.println("Saque não permitido");
        }else {
            System.out.println("Saque realizado com sucesso");
            setSaldo(getSaldo() - valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

