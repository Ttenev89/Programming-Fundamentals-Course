package dataTypesAndVariables.lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        char third = scanner.next().charAt(0);

        char [] array = {first, second, third};
        String string = String.valueOf(array);

        System.out.println(string);
    }
}
