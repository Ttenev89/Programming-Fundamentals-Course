package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isNotDifferent = true;
        int diffPosition = 0;

        for (int i = 0; i < firstArr.length; i++) {

            sum += firstArr[i];

            if (firstArr[i] != secondArr[i]) {
                isNotDifferent = false;
                diffPosition = i;
                break;
            }
        }
        if (isNotDifferent) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffPosition);
        }
    }
}
