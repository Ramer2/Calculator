public class Calculator {
    public static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }
}
