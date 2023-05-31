package Ex4;

import Ex4.Conta;

import java.util.Map;
import java.util.Scanner;

public class ContaPoupança extends Conta {
    public ContaPoupança(){
        verificarPoupança();
        mostrarDadosCliente();
    }
    public void verificarPoupança(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a opção desejada: ");
        System.out.println("1- Consultar saldo \t 2- Depositar");
        switch (input.nextInt()){

            case 1:
                System.out.println("R$ "+saldo);
                break;

            case 2:
                System.out.println("Informe o valor a depositar:");
                double valor = input.nextDouble();
                System.out.println("Novo saldo: "+(valor+saldo));
                break;

            default:
                System.out.println("Opção inválida");
                System.exit(0);


        }
    }
    public void mostrarDadosCliente(){
        for (Map.Entry<String, String> entry : cadastroCliente.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", CPF: " + entry.getValue());
        }

}}
