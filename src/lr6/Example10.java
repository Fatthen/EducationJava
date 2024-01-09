package lr6;

public class Example10 {

    public static int[] findMinMaxValues(int... numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 7};
        int[] result = findMinMaxValues(array);

        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}
