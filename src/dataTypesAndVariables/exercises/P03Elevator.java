package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(n /p);

        System.out.printf("%.0f", courses);
    }
}
