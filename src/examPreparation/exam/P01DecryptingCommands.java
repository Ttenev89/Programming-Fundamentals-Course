package examPreparation.exam;

import java.util.Scanner;

public class P01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decrypting = scanner.nextLine();
        String line = scanner.nextLine();

        while (!line.equals("Finish")) {

            String[] command = line.split("\\s+");

            switch (command[0]) {
                case "Replace":

                    decrypting = decrypting.replace(command[1], command[2]);
                    System.out.println(decrypting);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);

                    if (startIndex > 0 && endIndex < decrypting.length()) {
                        String first = decrypting.substring(0, startIndex);
                        String second = decrypting.substring(endIndex + 1);
                        decrypting = first + second;
                        System.out.println(decrypting);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperOrLower = command[1];
                    if (upperOrLower.equals("Upper")) {
                        decrypting = decrypting.toUpperCase();
                    } else  {
                        decrypting = decrypting.toLowerCase();
                    }
                    System.out.println(decrypting);
                    break;
                case "Check":
                    String isContains = command[1];
                    if (decrypting.contains(isContains)) {
                        System.out.println("Message contains " + isContains);
                    } else {
                        System.out.println("Message doesn't contain " + isContains);
                    }
                    break;
                case "Sum":
                    int indexOfStart = Integer.parseInt(command[1]);
                    int indexOfEnd = Integer.parseInt(command[2]);
                    if (indexOfStart >= 0 && indexOfEnd < decrypting.length()) {
                        int sum = 0;
                        for (int i = indexOfStart; i <= indexOfEnd; i++) {
                            sum += decrypting.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            line = scanner.nextLine();
        }
    }
}
