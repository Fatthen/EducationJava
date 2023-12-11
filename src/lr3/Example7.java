package lr3;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        char[] charArray = new char[size];

        char letter = 'a';
        for (int i = 0; i < size; i++) {
            charArray[i] = letter;
            letter += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nМассив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}
