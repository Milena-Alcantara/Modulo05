package Ex1;

public class TesteException {
//    solução 1:
    public static void main(String[] args) {
        System.out.println("Início da main");
        metodo1();
        System.out.println("Fim da main");

    }

    static void metodo1(){
        System.out.println("Início método 1");
        metodo2();
        System.out.println("Fim método 1");
    }

    static void metodo2(){
        try {
            System.out.println("Início método 2");
            int [] array = new int[10];
            for (int i = 0; i <=15 ; i++) {
                array[i] = i;
                System.out.println(i);
            }

        }catch (ArrayIndexOutOfBoundsException erro){
            System.err.println("Tamanho do vetor é menor que o solicitado no laço de reptição");
        }
        System.out.println("Fim do método 2");
    }
//    Solução 2: nesse caso, o for não vai cair na exceção
    static void metodo21() {
        System.out.println("Início método 2.1");
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do método 2.1");

    }}
