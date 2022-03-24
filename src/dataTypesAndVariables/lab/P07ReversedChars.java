package dataTypesAndVariables.lab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        char third = scanner.next().charAt(0);

        System.out.println(third + " " + second + " " + first);

    }
}
