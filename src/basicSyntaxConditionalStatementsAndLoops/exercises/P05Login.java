package basicSyntaxConditionalStatementsAndLoops.exercises;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            password.append(username.charAt(i));
        }
        boolean isLogged = false;
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();

            if (input.equals(password.toString())) {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);

        }
    }
}