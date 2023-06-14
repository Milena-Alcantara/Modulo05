package Ex1;

import java.math.BigDecimal;

public class Produto {
    String nome;
    BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void comprarProduto(Produto prod, BigDecimal menorPreco){
        if (prod.getPreco().equals(menorPreco) ){
            System.out.println("Você comprou o item mais barato");
        }else {
            System.out.println("Você não comprou o produto mais barato.");
        }
    }
}
