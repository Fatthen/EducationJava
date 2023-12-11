package lr3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] intArray = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            intArray[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray);
        int[] descendingArray = new int[size];
        for (int i = 0; i < size; i++) {
            descendingArray[i] = intArray[size - i - 1];
        }

        System.out.println("Массив в порядке убывания:");
        System.out.println(Arrays.toString(descendingArray));
    }
}