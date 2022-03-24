package methods.exercices;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

           isPalindromeIntegers(input);
            input = scanner.nextLine();
        }

    }

    private static void isPalindromeIntegers(String input) {

        int number = Integer.parseInt(input);
        int newNum = 0;
        int currentNum = number;

        for (;number != 0; number = number / 10) {
            int remainder = number % 10;
            newNum = newNum * 10 + remainder;
        }

        if (currentNum == newNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
