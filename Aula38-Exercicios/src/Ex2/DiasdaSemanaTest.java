package Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiasdaSemanaTest {
    @Test
   public void testaSeEDomingo(){
       CalcularDiaSemana calc = new CalcularDiaSemana();
       String teste =  calc.testaSeEDomingo("Domingo");
       assertEquals("Domingo",teste);
   }
}
