package ec.edu.epn.tdd.calculator;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.*;

public class CalculatorTest{

    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("SetUpClass");
    }
    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("Setup");
    }
    @Test
    public void give_two_integers_when_addition_them_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(3, 3));
    }
    @Test
    public void give_two_integers_when_substraction_them_ok() {
        System.out.println("Test 2");
        assertEquals(1, c.subtraction(4, 3));
    }
    @Test (expected = ArithmeticException.class)
    public void give_two_integers_when_division_them_exception() {
        System.out.println("Test 3");
        assertEquals(1, c.division(4, 0));
    }
    @Test (timeout = 150)
    public void give_two_integers_when_multiplication_them_timeout() {
        assertEquals(6, c.multiplication(3, 2));
        System.out.println("Test 4");
    }
    @After
    public void tearDown(){
        System.out.println("TearDown");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass");
    }
}
