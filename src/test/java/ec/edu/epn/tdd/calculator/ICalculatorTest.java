package ec.edu.epn.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void give_two_integers_when_addition_them_ok() {
        ICalculator a = Mockito.mock(ICalculator.class);
        Mockito.when(a.addition(2,3)).thenReturn(5);
        assertEquals(5, a.addition(2,3));
    }
}