package Ex3;



public class Main {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setSaldo(100);
        minhaConta.depositar(100);

        minhaConta.sacar( minhaConta.getSaldo());

    }
}
