package methods.lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        repeatString(input, repeatCount);
    }

    private static void repeatString(String input, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            System.out.print(input);
        }
    }
}
