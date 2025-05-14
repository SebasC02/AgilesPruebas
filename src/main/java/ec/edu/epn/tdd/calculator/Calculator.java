package ec.edu.epn.tdd.calculator;

public class Calculator {
    private int ans = 0;

    public int addition(int a, int b) {
        return a + b;
//        return 0;
    }
    // Comentario para crear un nuevo push
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int division(int a, int b) {
        return a / b;
    }
    public int multiplication(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a * b;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    public int getAns() {
        return 0;
    }

}
