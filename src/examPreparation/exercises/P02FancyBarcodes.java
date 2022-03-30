package examPreparation.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern patternBarcode = Pattern.compile("^@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+$");
        Pattern patternDigit = Pattern.compile("\\d");
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher barcodeMatcher = patternBarcode.matcher(barcode);
            if (barcodeMatcher.find()) {
                Matcher digitMatcher = patternDigit.matcher(barcode);
                StringBuilder productGroup = new StringBuilder();
                while (digitMatcher.find()) {
                    productGroup.append(digitMatcher.group());
                }
                if (productGroup.length() == 0) productGroup.append("00");
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
