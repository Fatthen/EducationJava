package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце:");
        int numberOfDays  = in.nextInt();

        if (numberOfDays <= 31) {
            System.out.println(month + " содержит: " + numberOfDays + " дней");
        }else {
            System.out.println("Такого быть не может, даже в теории");
        }
        in.close();
    }
}
