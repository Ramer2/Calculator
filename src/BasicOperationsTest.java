import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BasicOperationsTest {
    private final Random random = new Random();

    @Test
    public void testAdd1() {
        // arrange
        int a = 5;
        int b = 6;

        // act
        int result = Calculator.add(a, b);

        // assert
        Assertions.assertEquals(11, result, "Addition of two numbers failed (test 1).");
    }

    @Test
        // arrange
        int a = random.nextInt(1_000_000);
        int b = random.nextInt(1_000_000);

        // act
        int result = Calculator.add(a, b);

        // assert
        Assertions.assertEquals(a + b, result, "Addition of two random numbers failed.");
    }


    // subtraction
    @Test
    public void testSubtract1() {
        // arrange
        int a = 590;
        int b = 72;

        // act
        int result = Calculator.subtract(a, b);

        // assert
        Assertions.assertEquals(518, result, "Subtraction of two numbers failed (test 1).");
    }

    @Test
    public void testSubtract2() {
        // arrange
        int a = random.nextInt(1_000_000);
        int b = random.nextInt(1_000_000);

        // act
        int result = Calculator.subtract(a, b);

        // assert
        Assertions.assertEquals(a - b, result, "Subtraction of two numbers failed (test 2).");
    }

    @Test
    public void testMultiply1() {
        // arrange
        int a = 17;
        int b = 25;

        // act
        int result = Calculator.multiply(a, b);

        // assert
        Assertions.assertEquals(425, result, "Multiplication of two numbers failed (test 1).");
    }

    @Test
    public void testMultiply2() {
        // arrange
        int a = random.nextInt(1_000_000);
        int b = random.nextInt(1_000_000);

        // act
        int result = Calculator.multiply(a, b);

        // assert
        Assertions.assertEquals(a * b, result, "Multiplication of two numbers failed (test 2).");
    }

    @Test
    public void testDivide1() {
        // arrange
        int a = 786;
        int b = 6;

        // act
        int result = Calculator.divide(a, b);

        // assert
        Assertions.assertEquals(131, result, "Division of two numbers failed (test 1).");
    }

    @Test
    public void testDivide2() {
        // arrange
        int a = random.nextInt(1_000_000);
        int b = random.nextInt(1_000_000);

        // act
        int result = Calculator.divide(a, b);

        // assert
        Assertions.assertEquals(a / b, result, "Division of two numbers failed (test 1).");
    }

    @Test
    void testDivideByZero() {
        // arrange
        int a = 90;
        int b = 0;

        // act && assert
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(a, b));
    }
}
