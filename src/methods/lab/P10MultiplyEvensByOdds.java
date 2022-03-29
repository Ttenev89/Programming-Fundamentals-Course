package methods.lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input < 0) {
            input *= -1;
        }

        int multiple = getMultiplyEvensByOdds(input);
        System.out.println(multiple);
    }

    private static int getMultiplyEvensByOdds(int number) {
        int evenSum = getSumOfEven(number);
        int oddSum = getSumOfOdd(number);
        return evenSum * oddSum;
    }

    private static int getSumOfOdd(int number) {
        int oddSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 1) {
                oddSum += digits;
            }
            number /= 10;
        }
        return oddSum;
    }

    private static int getSumOfEven(int number) {
        int evenSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 0) {
                evenSum += digits;
            }
            number /= 10;
        }
        return evenSum;
    }
}
