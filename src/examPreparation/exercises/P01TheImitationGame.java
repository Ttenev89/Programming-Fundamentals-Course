package examPreparation.exercises;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {

            String[] attribute = command.split("\\|");
            switch (attribute[0]) {
                case "Move":
                    int letters = Integer.parseInt(attribute[1]);
                    input.append(input.substring(0, letters));
                    input.delete(0, letters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(attribute[1]);
                    String toInsert = attribute[2];
                    if (index >= 0 && index <= input.length()) {
                        input.insert(index, toInsert);
                    }
                    break;
                case "ChangeAll":
                    String oldString = attribute[1];
                    String newString = attribute[2];
                    input.replace(0, input.length(), input.toString().replace(oldString, newString));
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + input);
    }
}
