package Ex2;

public class CalcularDiaSemana {
    String dia = "Domingo";
    public String testaSeEDomingo(String entrada){
        if (getDia().equals(entrada)) {
            System.out.println("Domingo é o melhor dia da feira");
        }else {
            System.out.println("Não é o melhor dia da feira");
        }
        return entrada;
    }

    public String getDia() {
        return dia;
    }
}
