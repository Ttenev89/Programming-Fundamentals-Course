package methods.lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int length = 1; length <= n; length++) {
            printTriangle(length);
        }
        for (int length = n - 1; length > 0; length--) {
            printTriangle(length);
        }

    }

    private static void printTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i);
            if (i < length) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
