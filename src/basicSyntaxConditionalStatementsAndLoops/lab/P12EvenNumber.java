package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (number % 2 == 0) {
                System.out.println("The number is: " + Math.abs(number));
                break;
            }
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }
    }
}
