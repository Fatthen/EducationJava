package lr4;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();
        int[][] ArraySnake = new int[a][b];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < ArraySnake.length; h++) {
            for (int j = 0; j < (ArraySnake[i].length - hvost); j++) {
                ArraySnake[i][j] = telo;
                telo++;
            }
            if (i < ArraySnake.length - 1) {
                i++;
            }
            for (int o = a - 1; o > hvost; o--) {
                ArraySnake[o][ArraySnake[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < ArraySnake.length; i++) {
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ArraySnake[i].length; j++) {
                System.out.print(ArraySnake[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
