package Ex4;

import Ex4.CalculodeTributos;
import Ex4.Conta;

import java.util.Map;

public class ContaCorrente extends Conta implements CalculodeTributos {

public ContaCorrente(){
    System.out.println(calcularTributo());
    mostrarDadosCliente();
}
    @Override
    public double calcularTributo() {
        System.out.println("O valor do tributo para Conta Corrente "+(saldo*0.01));
        System.out.println("Seu saldo será: ");
        return saldo -=saldo*0.01;
    }

    public void mostrarDadosCliente(){
        for (Map.Entry<String, String> entry : cadastroCliente.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", CPF: " + entry.getValue());
        }
}}
