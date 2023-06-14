package Ex1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTest {
    BigDecimal menorPreco = new BigDecimal("2.00");
    @Test
    public void verificaSeEstaComprandoOmaisBarato(){
        Produto prod = new Produto("Maçã", new BigDecimal("2.00"));
        prod.comprarProduto(prod,menorPreco);
        assertEquals(menorPreco,prod.getPreco());
    }

    @Test
    public void verificaSeEstaComprandoOMaisBaratoDois(){
        Produto prod2 = new Produto("Banana", new BigDecimal("3.00"));
        prod2.comprarProduto(prod2,menorPreco);
        assertEquals(menorPreco,prod2.getPreco());
    }

    @Test
    public void verificaSeEstaComprandoOMaisBaratoTres(){
        Produto prod3 = new Produto("Uva", new BigDecimal("4.00"));
        prod3.comprarProduto(prod3,menorPreco);
        assertEquals(menorPreco,prod3.getPreco());
    }
}
