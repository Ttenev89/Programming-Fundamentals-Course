package basicSyntaxConditionalStatementsAndLoops.exercises;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitOne = Integer.parseInt(scanner.nextLine());
        int digitTwo = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = digitOne; i <= digitTwo ; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);

    }
}
