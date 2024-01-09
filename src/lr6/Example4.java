package lr6;

public class Example4 {

    public static void main(String[] args) {
        int n = 6;
        int doubleFactorial = calculateDoubleFactorial(n);
        System.out.println(n + "!! = " + doubleFactorial);
    }

    public static int calculateDoubleFactorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i -= 2) {
            result *= i;
        }
        return result;
    }
}
