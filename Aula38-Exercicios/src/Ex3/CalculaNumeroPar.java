package Ex3;

public class CalculaNumeroPar {
    public boolean verificaSeEPar(int numero){
        if (numero % 2 == 0){
            System.out.println("O número é par");
            return true;
        }else {
            System.out.println("O número é ímpar");
        }
        return false;
    }
}
