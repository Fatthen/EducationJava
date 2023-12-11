package lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели:");
        String dayOfWeek = in.nextLine();

        int number = switch (dayOfWeek) {
            case "понедельник" -> 1;
            case "вторник" -> 2;
            case "среда" -> 3;
            case "четверг" -> 4;
            case "пятница" -> 5;
            case "суббота" -> 6;
            case "воскресенье" -> 7;
            default -> throw new IllegalStateException("Некорректное значение: " + dayOfWeek);
        };

        System.out.println("Порядковый номер недели: " + number);
    }

}
