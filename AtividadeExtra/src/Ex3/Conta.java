package Ex3;

public class Conta  extends ContaExcecao{
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valorDeposito){
        setSaldo(getSaldo()+valorDeposito);
    }

}
