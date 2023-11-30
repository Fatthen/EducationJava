package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        if (number % 4 == 0 & number >= 10) {
            System.out.println("Число удовлетворяет критериям!");
        } else {
            System.out.println("Число не удовлетворяет условиям!");
        }
        in.close();
    }
}
