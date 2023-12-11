package lr3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = in.nextInt();

        int first = 1;
        int second = 1;

        System.out.print("Последовательность чисел Фибоначчи: " + first + ", " + second);

        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
