package basicSyntaxConditionalStatementsAndLoops.exercises;

import java.util.Objects;
import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double sum = 0;

        switch (dayOfWeek) {
            case "Friday":
                switch (groupType) {
                    case "Students":
                        sum = 8.45;
                        break;
                    case "Business":
                        sum = 10.90;
                        break;
                    case "Regular":
                        sum = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType) {
                    case "Students":
                        sum = 9.80;
                        break;
                    case "Business":
                        sum = 15.60;
                        break;
                    case "Regular":
                        sum = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType) {
                    case "Students":
                        sum = 10.46;
                        break;
                    case "Business":
                        sum = 16;
                        break;
                    case "Regular":
                        sum = 22.50;
                        break;
                }
                break;
        }

        double totalSum = sum * count;

        if (Objects.equals(groupType, "Students") && count >= 30) {
            totalSum *= 0.85;
        }
        if (Objects.equals(groupType, "Business") && count >= 100) {
            totalSum = (count - 10) * sum;
        }
        if (Objects.equals(groupType, "Regular") && count >= 10 && count <= 20) {
            totalSum *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalSum);
    }
}
