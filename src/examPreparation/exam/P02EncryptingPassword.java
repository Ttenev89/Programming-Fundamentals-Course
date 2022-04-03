package examPreparation.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputsCount = Integer.parseInt(scanner.nextLine());

        String regex = "^(.*)>(?<numbers>[0-9]{3})\\|(?<lowerCase>[a-z]{3})\\|(?<upperCase>[A-Z]{3})\\|(?<symbols>[^.<>]{3})<\\1$";

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < inputsCount; i++) {
            StringBuilder password = new StringBuilder(scanner.nextLine());
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                String firstGroup = matcher.group("numbers");
                String secondGroup = matcher.group("lowerCase");
                String thirdGroup = matcher.group("upperCase");
                String fourthGroup = matcher.group("symbols");

                password.delete(0, password.length());
                password.append(firstGroup);
                password.append(secondGroup);
                password.append(thirdGroup);
                password.append(fourthGroup);
                System.out.println("Password: " + password);
            } else {
                System.out.println("Try another password!");
            }

        }
    }
}
