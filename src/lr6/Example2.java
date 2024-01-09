package lr6;

public class Example2 {

    private static int number = 0;

    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + number);
        number++;
    }

    public static void main(String[] args) {
        displayAndIncrement();
        displayAndIncrement();
        displayAndIncrement();
    }
}
