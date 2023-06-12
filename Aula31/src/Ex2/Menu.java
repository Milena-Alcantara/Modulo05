package Ex2;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Menu {
   static Scanner input = new Scanner(System.in);

    public static void mostrarMenu() {
        Menu.input.useLocale(Locale.US);   //muda a forma de como um número decimal é rcebido conforme a localidade// BR = COM , // US = COM .
                try {
                    System.out.println("Bem vindo ao Conversor de Moedas!");
                    System.out.println("Escolha 1- Dólar \t 2- Dólar Canadense \t 3- Euro \t 4- Libra Esterlina \t 0 - Encerrar");
                    switch (input.nextInt()) {
                        case 0:
                            System.out.println("Programa Encerrado");
                            System.exit(0);

                        case 1:
                            Conversor.converterDolar();
                            break;

                        case 2:
                            Conversor.converterDolarCanadense();
                            break;

                        case 3:
                            Conversor.converterEuro();
                            break;

                        case 4:
                            Conversor.converterLIbra();
                            break;

                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException erro2) {
                    System.err.println("Tipo de moeda inválida, tente novamente.");
                    mostrarMenu();
                } catch (InputMismatchException erro0) {
                    System.err.println("Entrada inválida, tente novamente");
                    input.nextLine();     // Descarta a entrada incorreta
                    mostrarMenu();       // Reinicia o menu
                }
        }


    }
