package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш год рождения:");
        int date = in.nextInt();

        int age = 2023 - date;

        System.out.println("Ваш возраст: " + age);
        in.close();
    }
}
