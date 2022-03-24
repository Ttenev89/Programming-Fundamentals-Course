package dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            char symbol = scanner.next().charAt(0);

            char word = (char) (symbol + key);

            System.out.print(word);
        }
    }
}
