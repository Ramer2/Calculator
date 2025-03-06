import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AdvancedOperationsTest {
    private final Random random = new Random();

    @Test
    public void testPower1() {
        // arrange
        int a = 5;
        int b = 6;

        // act
        long result = Calculator.pow(a, b);

        // assert
        Assertions.assertEquals(15_625, result, "Power operation failed (test 1).");
    }

    @Test
    public void testPower2() {
        // arrange
        long a = random.nextInt(16);
        long b = random.nextInt(16);

        // act
        long result = Calculator.pow(a, b);

        // assert
        Assertions.assertEquals(Math.pow(a, b), result, "Power operation failed (test 1).");
    }


    // subtraction
    @Test
    public void testGCD1() {
        // arrange
        int a = 24;
        int b = 36;

        // act
        int result = Calculator.gcd(a, b);

        // assert
        Assertions.assertEquals(12, result, "GCD of two numbers failed (test 1).");
    }

    @Test
    public void testGCD2() {
        // arrange
        int a = 18;
        int b = 30;

        // act
        int result = Calculator.gcd(a, b);

        // assert
        Assertions.assertEquals(6, result, "GCD of two numbers failed (test 2).");
    }

    @Test
    public void testLCM1() {
        // arrange
        int a = 4;
        int b = 6;

        // act
        int result = Calculator.lcm(a, b);

        // assert
        Assertions.assertEquals(12, result, "Multiplication of two numbers failed (test 1).");
    }

    @Test
    public void testLCM2() {
        // arrange
        int a = 5;
        int b = 7;

        // act
        int result = Calculator.lcm(a, b);

        // assert
        Assertions.assertEquals(35, result, "Multiplication of two numbers failed (test 2).");
    }
}
