package Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        boolean encerrar;
        do {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Eu sei dividir!");
                System.out.println("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                int y = teclado.nextInt();
                double r = (x/y);
                System.out.println("O resultado é: "+ r);
                encerrar = false;

            }catch (ArithmeticException erro1){
                System.err.println("Não consigo dividir por 0");
                encerrar = true;
            }catch (InputMismatchException erro2){
                System.err.println("Por favor informe somente números inteiros");
                encerrar = true;
            }
        }while (encerrar);


    }
}
