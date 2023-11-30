package lr1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        int number2 = number - 1;
        int number3 = number + 1;
        int number4 = ((number2 * number2) + (number * number) + (number3 * number3)) + (2 * number2 * number) + (2 * number2 * number3) + (2 * number * number3);
        System.out.println("Вот что у нас получилось: " + number2 + ", " + number + ", " + number3 + ", " + number4);
        in.close();
    }
}
