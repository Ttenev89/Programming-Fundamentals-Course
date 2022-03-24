package basicSyntaxConditionalStatementsAndLoops.moreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String gameType = scanner.nextLine();

        double price = 0;
        double reachedSum = 0;
        boolean isItOutOfMoney = false;

        while (!"Game Time".equals(gameType)) {
            switch (gameType) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    gameType = scanner.nextLine();
                    continue;
            }

            if (budget < price) {
                System.out.println("Too Expensive");
            } else {
                System.out.printf("Bought %s%n", gameType);
                reachedSum += price;
                budget -= price;
            }

            if (budget == 0) {
                System.out.println("Out of money!");
                isItOutOfMoney = true;
                break;

            }
            gameType = scanner.nextLine();

        }

        if (!isItOutOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", reachedSum, budget);
        }
    }
}
