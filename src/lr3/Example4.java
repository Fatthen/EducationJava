package lr3;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        System.out.println("Целые числа от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}