package arrays.exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i <= secondArr.length -1; i++) {
            String secondElement = secondArr[i];
            for (int j = 0; j <= firstArr.length - 1; j++) {
                String firstElement = firstArr[j];

                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
