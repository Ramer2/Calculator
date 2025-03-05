public class Calculator {
    public static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
