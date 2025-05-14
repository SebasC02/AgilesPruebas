package ec.edu.epn.tdd.calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1, 1, 2});
        objects.add(new Object[]{2, 1, 3});
        objects.add(new Object[]{3, 3, 6});
        objects.add(new Object[]{4, 5, 9});
        objects.add(new Object[]{55, 15, 70});
        objects.add(new Object[]{60, 21, 81});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then__ok() {
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }
}