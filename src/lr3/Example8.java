package lr3;

public class Example8 {

    public static void main(String[] args) {
        char[] charArray = new char[10];

        char letter = 'A';
        int count = 0;

        while (count < 10) {
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                charArray[count] = letter;
                count++;
            }
            letter++;
        }

        System.out.println("Содержимое массива:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
