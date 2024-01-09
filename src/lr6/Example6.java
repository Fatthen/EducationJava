package lr6;

public class Example6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = 3;
        int[] result = takeElements(arr, size);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] takeElements(int[] arr, int size) {
        if (size > arr.length) {
            int[] copy = new int[arr.length];
            System.arraycopy(arr, 0, copy, 0, arr.length);
            return copy;
        } else {
            int[] copy = new int[size];
            System.arraycopy(arr, 0, copy, 0, size);
            return copy;
        }
    }
}
