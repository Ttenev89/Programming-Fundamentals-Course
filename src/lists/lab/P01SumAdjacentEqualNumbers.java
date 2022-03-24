package lists.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                               .map(Double::parseDouble).collect(Collectors.toList());

        getResult(numbers);
    }

    private static void getResult(List<Double> numbers) {

        int index = 0;

        while (index < numbers.size() - 1) {
            if (numbers.get(index).equals(numbers.get(index + 1))) {
                numbers.set(index, numbers.get(index) + numbers.get(index + 1));
                numbers.remove(index + 1);
                index = 0;
            } else {
                index++;
            }
        }
        for (Double number:numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
