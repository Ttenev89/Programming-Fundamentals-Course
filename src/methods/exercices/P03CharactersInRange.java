package methods.exercices;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);

        getCharactersInRange(first, last);
    }

    private static void getCharactersInRange(char first, char last) {
        if (first < last){
            for (int i = first + 1; i < last; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = last +1; i < first; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
