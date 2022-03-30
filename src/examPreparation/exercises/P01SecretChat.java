package examPreparation.exercises;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {

            String[] commandAttribute = command.split(":\\|:");
            switch (commandAttribute[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandAttribute[1]);
                    input.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder reverseString = new StringBuilder(commandAttribute[1]);
                    index = input.indexOf(String.valueOf(reverseString));
                    if (index == -1) {
                        System.out.println("error");
                        continue;
                    } else {
                        input.replace(index, index + reverseString.length(), "");
                        input.append(reverseString.reverse());
                    }
                    break;
                case "ChangeAll":
                    String substring = commandAttribute[1];
                    String replacement = commandAttribute[2];
                    index = input.indexOf(substring);
                    while (index != -1) {
                        input.replace(index, index + substring.length(), replacement);
                        index = input.indexOf(substring);
                    }
                    break;
            }
            System.out.println(input);

            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + input);
    }
}
