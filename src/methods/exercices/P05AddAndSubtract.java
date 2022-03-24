package methods.exercices;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        getSum(num1, num2, num3);
    }

    public static void getSum (int num1, int num2, int num3) {
        System.out.println((num1 + num2) - num3);
    }
}
