package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
    }
}
