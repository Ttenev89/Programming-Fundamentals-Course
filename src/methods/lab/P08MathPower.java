package methods.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal number = new BigDecimal(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

         BigDecimal result = mathPower(number, power);
        System.out.println(result);
    }

    private static BigDecimal mathPower(BigDecimal number, int power) {
        number = number.pow(power);
        return number;
    }
}
