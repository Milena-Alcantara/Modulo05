package Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculaNumeroParTest {
    @Test
    public void testaSeONumeroEPar(){
        CalculaNumeroPar calc = new CalculaNumeroPar();
        boolean numero = calc.verificaSeEPar(2);
        assertEquals(true,numero);
    }
}
