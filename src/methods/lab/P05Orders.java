package methods.lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());


        makeTheSum(product, quantity);
    }

    private static void makeTheSum(String product, int quantity) {
        double sum = 0;
        switch (product){
            case "coffee" :
                sum = 1.50;
                break;
            case "water":
                sum = 1.00;
                break;
            case "coke":
                sum = 1.40;
                break;
            case "snacks":
                sum = 2.00;
                break;
        }
        double totalSum = sum * quantity;
        System.out.printf("%.2f", totalSum);
    }
}
