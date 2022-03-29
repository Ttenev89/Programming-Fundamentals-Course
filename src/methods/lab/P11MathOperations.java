package methods.lab;

import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(num1, operator, num2));

    }


    private static double calculate(int num1, String operator, int num2) {

        double result = 0.0;

        switch (operator) {
            case "/":
                result = num1 * 1.0 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        return result;
    }
}
