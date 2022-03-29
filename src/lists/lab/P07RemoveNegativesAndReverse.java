package lists.lab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) >= 0) {
                result.add(numbers.get(i));
            }
        }
        if (result.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
