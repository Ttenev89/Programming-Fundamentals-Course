package dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;

        boolean isEqual = Math.abs(n1 - n2) < eps;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
