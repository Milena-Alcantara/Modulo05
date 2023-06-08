package Ex3;
import java.util.Scanner;
public class ContaExcecao extends Exception {

    public void sacar(double saldo){
        Scanner teclado = new Scanner(System.in);
        boolean encerrar;
        do {
            try {
                System.out.println("Informe o valor que deseja sacar: ");
                double valorInformado = teclado.nextDouble();
                if (valorInformado > saldo) {
                    throw new IllegalArgumentException();

                }else {
                    System.out.println("Saque efetuado com sucesso! \n Saldo atualizado: "+(saldo-valorInformado));
                    encerrar = false;
                }

            }catch (IllegalArgumentException erro){
                System.err.println("Valor informado é maior do que o saldo disponível.");
                System.err.println("O seu saldo é: "+saldo);
                encerrar = true;
            }
        }while (encerrar);


    }
}
