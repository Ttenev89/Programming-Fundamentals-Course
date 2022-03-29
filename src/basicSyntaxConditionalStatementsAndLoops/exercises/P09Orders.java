package basicSyntaxConditionalStatementsAndLoops.exercises;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 0; i < n; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double currentPrice = (days * capsulesCount) * capsulePrice;

            totalSum += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
        }

        System.out.printf("Total: $%.2f", totalSum);
    }
}
