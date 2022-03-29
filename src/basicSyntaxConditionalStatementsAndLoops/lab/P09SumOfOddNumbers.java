package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 100; i+= 2) {
            System.out.println(i);
            sum += i;
            counter++;
            if (counter == n) {
                break;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}
