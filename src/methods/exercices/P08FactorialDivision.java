package methods.exercices;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        divideFactorial(num1, num2);
    }

    private static void divideFactorial(int num1, int num2) {

        double factorialOne = 1;
        double factorialTwo = 1;
        double sum;

        for (int i = 1; i <= num1; i++) {
            factorialOne *= i;
        }

        for (int i = 1; i <= num2; i++) {
            factorialTwo *= i;
        }

        sum = factorialOne / factorialTwo;
        System.out.printf("%.2f", sum);
    }
}
