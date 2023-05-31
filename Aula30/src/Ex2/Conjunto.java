package Ex2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjunto {
   public static Set<Integer> numeros = new HashSet<>();

    Scanner input = new Scanner(System.in);

    public  void pedirNumeros(){
        for (int i = 0; i <8 ; i++) {
            System.out.println("Informe o número: ");
            numeros.add(input.nextInt());
        }
        System.out.println(numeros);
// A diferença ocorre quando pedimos para adicionar os números pois o set não permite
//   a adição de valores iguais num conjunto, devido considerar cada conjunto como sendo único.
}}
