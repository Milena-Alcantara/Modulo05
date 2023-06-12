package Ex1;
import Ex2.Menu;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        teclado.useLocale(Locale.US);
        boolean continuar =false;
        do {
            try {
                System.out.println("Informe o produto desejado: ");
                System.out.println("1- Verdura \n 2- Legume \n 3- Grãos \n 4- Outros");

                switch (teclado.nextInt()){
                    case 1:
                    Produto verdura = new Produto();
                    verdura.pedirQtEmGramas();
                    verdura.pedirNome();
                    verdura.adicionaVerduraEmLista(verdura);
                        break;

                    case 2:
                    Produto legume = new Produto();
                    legume.pedirQtEmInteiro();
                    legume.pedirNome();
                    legume.adcionaLegumesEmlista(legume);

                        break;

                    case 3:
                    Produto graos = new Produto();
                    graos.pedirQtEmGramas();
                    graos.pedirNome();
                    graos.adicionaGraosEmlista(graos);
                        break;

                    case 4:
                    Produto outros = new Produto();
                    outros.pedirQtEmInteiro();
                    outros.pedirNome();
                    outros.adcionaOutrosEmlista(outros);
                        break;

                    default:
                        throw new IllegalArgumentException();
                }
                finalizar();
            }catch (InputMismatchException erro2){
                teclado.nextLine();
                System.err.println("Opção inválida");
                continuar = true;

            }catch (IllegalArgumentException erro1) {
                System.err.println("Tipo de alimento inválido");
                continuar = true;
            }
        }while (continuar);
    }

    public static void finalizar(){
        boolean continuar =false;
        do {
            try {
                System.out.println("Deseja continuar adicionando produtos? ");
                System.out.println("1- Sim \t 2- Não");

                switch (teclado.nextInt()){
                    case 1:
                        Menu();
                        break;

                    case 2:

                        Produto.mostarListaVerdura();
                        Produto.mostarListaLegumes();
                        Produto.mostarListaGraos();
                        Produto.mostarListaOutros();
                        System.exit(0);


                    default:
                        throw new IllegalArgumentException();
                }

            }catch (InputMismatchException erro){
                teclado.nextLine();
                System.err.println("Entrada inválida, tente novamente.");
                continuar = true;
            }catch (IllegalArgumentException erro1) {
                System.err.println("Opção inválida");
                continuar = true;
            }

        }while (continuar);


    }
}
