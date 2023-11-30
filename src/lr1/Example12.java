package lr1;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = in.nextInt();

        int date = 2023 - age;

        System.out.println("Ваш год рождения: " + date + "!");
        in.close();
    }
}
