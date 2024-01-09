package lr6;

public class Example9 {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        reverseArray(array);
        System.out.println(array);
    }

    public static void reverseArray(char[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}
