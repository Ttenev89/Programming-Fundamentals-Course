package examPreparation.exercises;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("Done")) {

            String[] command = line.split("\\s+");
            switch (command[0]) {
                case "TakeOdd":
                    for (int i = 0; i < password.length(); i++) {
                        password.deleteCharAt(i);
                    }
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    password.delete(index, index + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String strToReplace = command[1];
                    String strToAdd = command[2];
                    if (password.toString().equals(password.toString().replace(strToReplace, strToAdd))) {
                        System.out.println("Nothing to replace!");
                    } else {
                        password = new StringBuilder(password.toString().replace(strToReplace, strToAdd));
                        System.out.println(password);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Your password is: "+ password);
    }
}
