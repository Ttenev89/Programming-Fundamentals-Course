package textProcessing.exercises;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s");

        for (String s: input) {
            boolean isValid = true;

            if (s.length() < 3 || s.length() > 16) {
                isValid = false;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (!Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i)!= '-' && s.charAt(i) != '_') {
                        isValid = false;
                    }
                }
            }
            if (isValid) {
                System.out.println(s);
            }
        }
    }
}
