package lr4;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника:");
        int width = in.nextInt();

        System.out.println("Введите высоту прямоугольника:");
        int height = in.nextInt();

        int[][] arr = new int[height][width];

        int z = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            int count = i + 1;
            System.out.print("Номер строки " + count + " : ");
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
                z++;
            }
            System.out.println("Количество символов в строке " + z);
            z = 0;
        }
    }
}
