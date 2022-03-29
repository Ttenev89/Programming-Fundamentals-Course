package dataTypesAndVariables.lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= input; num++) {
            int sumOfDigits = 0;
            int digits = num;

            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits /= 10;
            }

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
        }
    }
}
