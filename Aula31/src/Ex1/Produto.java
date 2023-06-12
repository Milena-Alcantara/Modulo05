package Ex1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Produto {
    private String quantidade;
    private String nome;
    private double qtConvertida;
    private int quantidadeInt;

    private static List<Produto> verdura = new ArrayList<>();
    private static List<Produto> graos = new ArrayList<>();
    private static List<Produto> legumes = new ArrayList<>();
    private static List<Produto> outros = new ArrayList<>();


    public Produto() {
    }

    public Produto(String quantidade, String nome) {
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public void pedirQtEmGramas(){
        boolean continuar;
        do {
            try {
                System.out.println("Informe a quantidade desejada: ");
                this.setQuantidade(Main.teclado.next());

                if (getQuantidade().matches("[0-9]*")){
                    throw new NumberFormatException();
                }
                setQtConvertida(Double.parseDouble(getQuantidade()));
                if (getQtConvertida() <= 0){
                    throw new ArithmeticException();
                }else {
                    continuar =false;
                }

            }catch (NumberFormatException erro){
                System.err.println("Para VERDURAS E GRÃOS, a quantidade deve ser informada com .");
                continuar = true;

            }catch (ArithmeticException erro3){
                System.err.println("Não é perimitido inserir um valor negativo");
                continuar = true;
            }
        }while (continuar);
    }

    public void pedirQtEmInteiro(){
        boolean continuar;
        do {
            try {
                System.out.println("Informe a quantidade desejada: ");
                this.setQuantidade(Main.teclado.next());

                if (getQuantidade().contains(".") || getQuantidade().contains(",")){
                    throw new NumberFormatException();
                }
                setQuantidadeInt(Integer.parseInt(getQuantidade()));
                if (getQuantidadeInt()<= 0){
                    throw new ArithmeticException();
                }else {
                    continuar =false;
                }

            }catch (NumberFormatException erro){
                System.err.println("Para LEGUMES E OUTROS, a quantidade deve ser informada em unidades inteiras");
                continuar = true;

            }catch (ArithmeticException erro3){
                System.err.println("Não é perimitido inserir um valor negativo");
                continuar = true;
            }
        }while (continuar);

    }
    public void pedirNome(){
        boolean continuar;
        do {
            try {
                System.out.println("Informe o nome do Produto: ");
                setNome(Main.teclado.next());
                if (!(getNome().matches("[a-zA-Z-Ç-ç]+"))){
                    throw new UnsupportedOperationException();
                }
                continuar = false;
            }catch (UnsupportedOperationException erro){
                System.err.println("Não é possível inserir nome vazio.");
                continuar = true;
            }
        }while (continuar);
    }

    public void adicionaVerduraEmLista(Produto objeto){
        verdura.add(objeto);
    }
    public void adicionaGraosEmlista(Produto objeto){
        graos.add(objeto);
    }
    public void adcionaLegumesEmlista(Produto objeto){legumes.add(objeto);}
    public void adcionaOutrosEmlista(Produto objeto){
        outros.add(objeto);}
    public static void mostarListaVerdura(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Segue a lista de verduras: ");
        for (int i = 0; i <verdura.size() ; i++) {
            System.out.println(verdura.get(i).getNome()+" : "+verdura.get(i).getQtConvertida()+" Kg");
        }
        System.out.println("A quantidade de verduras é: "+verdura.size());
    }
    public static void mostarListaLegumes(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Segue a lista de legumes: ");
        for (int i = 0; i <legumes.size() ; i++) {
            System.out.println(legumes.get(i).getNome()+" Quantidade: "+legumes.get(i).getQuantidadeInt());
        }
        System.out.println("A quantidade de legumes é: "+legumes.size());
    }
    public static void mostarListaGraos(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Segue a lista de grãos: ");
        for (int i = 0; i <graos.size() ; i++) {
            System.out.println(graos.get(i).getNome()+" : "+graos.get(i).getQtConvertida()+" Kg");
        }
        System.out.println("A quantidade de grãos é: "+graos.size());
    }
    public static void mostarListaOutros(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Segue a lista de outros produtos: ");
        for (int i = 0; i <outros.size() ; i++) {
            System.out.println(outros.get(i).getNome()+" Quantidade: "+outros.get(i).getQuantidadeInt());
        }
        System.out.println("A quantidade de legumes é: "+outros.size());
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtConvertida() {
        return qtConvertida;
    }

    public void setQtConvertida(double qtConvertida) {
        this.qtConvertida = qtConvertida;
    }

    public int getQuantidadeInt() {
        return quantidadeInt;
    }

    public void setQuantidadeInt(int quantidadeInt) {
        this.quantidadeInt = quantidadeInt;
    }
}
