package Ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrentesTest {
    @Test
    public void testaSeEPossivelDepositar(){
        ContaCorrente conta1 = new ContaCorrente(1234, "Milena",1200.00);
       double valor =  conta1.depositarConta(200, conta1);
        assertEquals(1400.00,valor );
    }

    @Test
    public void testaSeEPossivelSacar(){
        ContaCorrente conta2 = new ContaCorrente(4321,"Margarida",0);
        conta2.sacar(10);
        assertEquals(0,conta2.getSaldo());
    }

}
