package Ex4;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Conta {

    protected double saldo;
   static   Scanner input = new Scanner(System.in);
  static Map<String, String> cadastroCliente = new HashMap<>();

    public Conta(){
        this.saldo = 1000;
    }
    public static void decisao(){

        System.out.println("Informe a opção desejada");
        System.out.println("1- Conta Poupança \t 2- Conta Corrente \t 3- Seguro de Vida");

        switch (input.nextInt()){
            case 1:
            cadastrarCliente();
            ContaPoupança contaPoupa = new ContaPoupança();

            break;

            case 2:
                cadastrarCliente();
            ContaCorrente contaUser = new ContaCorrente();

            break;

            case 3:
                cadastrarCliente();
                System.out.println("Deseja contratar o Seguro de Vida?\n 1- Sim \t 2- Não");
                if (input.nextInt() == 1){
                    SegurodeVida novoSegurado = new SegurodeVida();
                }else {
                    System.out.println("Seguro não contratado.");
                }

                break;

            default:
                System.out.println("Inválido");
                System.exit(0);
        }
}
    public static void cadastrarCliente(){
        System.out.println("Informe seu nome e CPF: " );
        cadastroCliente.put(input.next(), input.next());
    }


    }

