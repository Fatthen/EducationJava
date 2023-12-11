package lr3;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел для суммирования:");
        int count = in.nextInt();

        int sum = 0;
        int numbersFound = 0;
        int number = 1;

        System.out.println("Числа, удовлетворяющие критериям:");

        while (numbersFound < count) {
            if (number % 5 == 2 || number % 3 == 1) {
                sum += number;
                System.out.println(number + " ");
                numbersFound++;
            }
            number++;
        }

        System.out.println("\nСумма чисел: " + sum);
    }
}
