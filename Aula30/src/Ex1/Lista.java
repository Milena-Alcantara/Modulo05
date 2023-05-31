package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

   public static Scanner input = new Scanner(System.in);

    public static List<Integer> numeros = new ArrayList<>();

    public  static void pedirNumeros(){
        for (int i = 0; i <8 ; i++) {
            System.out.println("Informe o número: ");
            numeros.add(input.nextInt());
        }
        System.out.println(numeros);
    }
}
