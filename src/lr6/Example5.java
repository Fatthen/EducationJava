package lr6;

public class Example5 {

    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfSquares(n);
        System.out.println("Сумма квадратов натуральных чисел до " + n + " равна " + sum);
    }

    public static int sumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
