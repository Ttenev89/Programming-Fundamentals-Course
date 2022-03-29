package basicSyntaxConditionalStatementsAndLoops.moreExercises;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));

        }
        System.out.println(reverseWord);
    }
}
