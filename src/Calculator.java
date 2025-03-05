// this is a comment
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
    public static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }
}
