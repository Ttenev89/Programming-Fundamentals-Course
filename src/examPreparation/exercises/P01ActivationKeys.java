package examPreparation.exercises;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] commandAttribute = command.split(">>>");

            switch (commandAttribute[0]) {
                case "Contains":
                    if (rawKey.contains(commandAttribute[1])) {
                        System.out.println(rawKey + " contains " + commandAttribute[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commandAttribute[2]);
                    int endIndex = Integer.parseInt(commandAttribute[3]);
                    if ("Upper".equals(commandAttribute[1])) {
                        rawKey = rawKey.substring(0, startIndex) + rawKey.substring(startIndex, endIndex).toUpperCase()
                                + rawKey.substring(endIndex);
                    } else {
                        rawKey = rawKey.substring(0, startIndex) + rawKey.substring(startIndex, endIndex).toLowerCase()
                                + rawKey.substring(endIndex);
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(commandAttribute[1]);
                    endIndex = Integer.parseInt(commandAttribute[2]);
                    rawKey = rawKey.substring(0, startIndex) + rawKey.substring(endIndex);
                    System.out.println(rawKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + rawKey);
    }
}
