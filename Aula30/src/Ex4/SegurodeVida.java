package Ex4;

import Ex4.CalculodeTributos;
import Ex4.Conta;

import java.util.Map;

public class SegurodeVida extends Conta implements CalculodeTributos {
public SegurodeVida(){
    System.out.println(calcularTributo());
    mostrarDadosCliente();
}
    @Override
    public double calcularTributo() {
        System.out.println("O valor da taxa é R$ 42");
        saldo -= 42;
        System.out.println("Seguro debitado com sucesso, seu saldo atual:");
        return saldo;
    }

    public void mostrarDadosCliente(){
        for (Map.Entry<String, String> entry : cadastroCliente.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", CPF: " + entry.getValue());
        }
}}
