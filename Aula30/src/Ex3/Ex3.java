package Ex3;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    Map<String,String> objetos = new HashMap<>();

    public void inserirObjetoseMostrar(){
        objetos.put("Estojo","Roxo");
        objetos.put("Blusa","Preta");
        objetos.put("Flor","vermelho");

        System.out.println("HashMap:");
        for (Map.Entry<String, String> entry : objetos.entrySet()) {
            System.out.println("Objeto: " + entry.getKey() + ", Cor: " + entry.getValue());
        }
        System.out.println();


    }

}
