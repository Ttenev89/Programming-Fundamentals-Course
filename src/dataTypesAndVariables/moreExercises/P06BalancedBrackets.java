package dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int openingBrackets = 0;
        int closedBrackets = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openingBrackets++;
            } else if (input.equals(")")) {
                closedBrackets++;
                if (openingBrackets - closedBrackets != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }

        }

        if (openingBrackets == closedBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
