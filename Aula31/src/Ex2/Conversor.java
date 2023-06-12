package Ex2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.InputMismatchException;


public class Conversor {
    static LocalDate dataDeHoje = LocalDate.now();

    public static void mostrarMsg(){
        System.out.println("O conversor só pode converter as moedas citadas para REAL R$");
    }
    public static void converterDolar() {
        double valorConvertido;
            try {
                mostrarMsg();
                System.out.println("Informe o valor que deseja converter: ");
                String valorRecebido = Menu.input.next();
//                valorRecebido.matches("[0-9]*")|| OUTRA FORMA DE VERIFICAR SE O NÚMERO NÃO É DECIMAL
//                !(valorRecebido.contains("."))
                if (valorRecebido.contains(" ")|| valorRecebido.matches("[0-9]*")){
                    throw new NumberFormatException();
                }else {
                    valorConvertido = Double.parseDouble(valorRecebido);
                }
                BigDecimal valorUser = new BigDecimal(valorConvertido);
                BigDecimal cotacao = new BigDecimal(5.25);
                int verificacao = valorUser.intValue();
                if (!(verificacao <0)) {
                    System.out.println("No dia de hoje " + dataDeHoje + " a cotação do Dolar está em U$" + cotacao.doubleValue() + "\nO valor que será convertido é U$" + valorUser.doubleValue() + "\nO valor convertido em real é R$" + valorUser.multiply(cotacao).doubleValue());
                    finalizar();
                }else {
                    System.err.println("Valor inválido, por favor, tente novamente");
                    converterDolar();
                }
            }catch (InputMismatchException erro){
                System.err.println("Entrada Inválida");
                Menu.input.nextLine();
                converterDolar();
            }catch (NumberFormatException erro2){
                System.err.println("Para realizar a conversão, é necessário informar valor somente com ponto");
                Menu.input.nextLine();
                converterDolar();
            }
        }

//        OUTRA FORMA DE VERIFICAR SE O USUÁRIO DIGITOU EM BRANCO
//        public static boolean verificarsSeeVazio(String valorRecebido){
//        return valorRecebido.isBlank();
//        }




    public static void converterDolarCanadense(){
        try {
            double valorConvertido;
            mostrarMsg();
            System.out.println("Informe o valor que deseja converter: ");
            String valorRecebido = Menu.input.next();
            if (valorRecebido.contains(" ")|| valorRecebido.matches("[0-9]*")){
                throw new NumberFormatException();
            }else {
                valorConvertido = Double.parseDouble(valorRecebido);
            }
            BigDecimal valorUser = new BigDecimal(valorConvertido);
            BigDecimal cotacao= new BigDecimal(4.15);
            int verificacao = valorUser.intValue();
            if (!(verificacao <= 0)) {
                System.out.println("No dia de hoje " + dataDeHoje + " a cotação do Dolar Canadense está em " + cotacao.doubleValue() + "\nO valor que será convertido é " + valorUser.doubleValue() + "\nO valor convertido em real é R$" + valorUser.multiply(cotacao).doubleValue());
                finalizar();
            }else {
                System.err.println("Valor inválido, por favor, tente novamente");
                converterDolarCanadense();
            }
        }catch (InputMismatchException erro1){
            System.err.println("Entrada Inválida");
            Menu.input.nextLine();
            converterDolarCanadense();
        }catch (NumberFormatException erro2){
            System.err.println("Para realizar a conversão, é necessário informar valor somente com ponto");
            Menu.input.nextLine();
            converterDolarCanadense();
        }
    }
    public static void converterEuro(){
        try {
            double valorConvertido;
            mostrarMsg();
            System.out.println("Informe o valor que deseja converter: ");
            String valorRecebido = Menu.input.next();
            if (valorRecebido.contains(" ")|| valorRecebido.matches("[0-9]*")){
                throw new NumberFormatException();
            }else {
                valorConvertido = Double.parseDouble(valorRecebido);
            }
            BigDecimal valorUser = new BigDecimal(valorConvertido);
            BigDecimal cotacao= new BigDecimal(6.15);
            int verificacao = valorUser.intValue();
            if (!(verificacao <= 0)) {
                System.out.println("No dia de hoje " + dataDeHoje + " a cotação do Euro está em " + cotacao.doubleValue() + "\nO valor que será convertido é " + valorUser.doubleValue() + "\nO valor convertido em real é R$" + valorUser.multiply(cotacao).doubleValue());
                finalizar();
            }else {
                System.err.println("Valor inválido, por favor, tente novamente");
                converterEuro();
            }
        }catch (InputMismatchException erro){
            System.err.println("Entrada Inválida");
            Menu.input.nextLine();
           converterEuro();
        }catch (NumberFormatException erro2) {
            System.err.println("Para realizar a conversão, é necessário informar valor somente com ponto");
            Menu.input.nextLine();
           converterEuro();
        }
    }
    public static void converterLIbra(){
        try {
            double valorConvertido;
            mostrarMsg();
            System.out.println("Informe o valor que deseja converter: ");
            String valorRecebido = Menu.input.next();
            if (valorRecebido.contains(" ")|| valorRecebido.matches("[0-9]*")){
                throw new NumberFormatException();
            }else {
                valorConvertido = Double.parseDouble(valorRecebido);
            }
            BigDecimal valorUser = new BigDecimal(valorConvertido);
            BigDecimal cotacao= new BigDecimal(7.50);

            int verificacao = valorUser.intValue();
            if (!(verificacao <= 0)) {
                System.out.println("No dia de hoje " + dataDeHoje + " a cotação da Libra está em " + cotacao.doubleValue() + "\nO valor que será convertido é " + valorUser.doubleValue() + "\nO valor convertido em real é R$" + valorUser.multiply(cotacao).doubleValue());
                finalizar();
            }else {
                System.err.println("Valor inválido, por favor, tente novamente");
                converterLIbra();
            }
        }catch (InputMismatchException erro) {
            System.err.println("Entrada Inválida");
            Menu.input.nextLine();
            converterLIbra();
        }catch (NumberFormatException erro2) {
            System.err.println("Para realizar a conversão, é necessário informar valor somente com ponto");
            Menu.input.nextLine();
            converterLIbra();
        }
    }

    public static void finalizar(){
        boolean encerrar = false;
        do {
            try {
                System.out.println("Deseja fazer uma nova conversão? \n 1- Sim \n 2- Não");
                switch (Menu.input.nextInt()) {
                    case 1:
                        Menu.mostrarMenu();
                        break;
                    case 2:
                        System.out.println("Programa Encerrado");
                        System.exit(0);
                        break;
                    default:
                        throw new NumberFormatException();
                }

            }catch (NumberFormatException erro1){
                System.err.println("Por favor informe uma das opções que constam no menu");
                encerrar = true;
            }catch (InputMismatchException erro2){
                System.err.println("Entrada inválida, tente novamente");
                Menu.input.nextLine();
                encerrar = true;
            }
        }while (encerrar);


    }


}
