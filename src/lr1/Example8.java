package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели:");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите название месяца:");
        String nameMonth = in.nextLine();

        System.out.println("Введите номер дня в месяце:");
        int numberDay = in.nextInt();

        System.out.println("Сегодняшняя дата: " + dayOfWeek + ", " + numberDay + ", " + nameMonth + "!");
        in.close();
    }
}
