package lr6;

public class Example7 {

    public static void main(String[] args) {
        // Пример использования метода
        char[] charArray = {'a', 'b', 'c'};
        int[] intArray = charArrayToIntArray(charArray);
        System.out.println(java.util.Arrays.toString(intArray)); // Выводит [97, 98, 99]
    }

    public static int[] charArrayToIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        return intArray;
    }
}
