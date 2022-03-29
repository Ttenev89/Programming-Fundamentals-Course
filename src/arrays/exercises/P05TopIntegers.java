package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;
            for (int j = 1 + i; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
