package lists.exercices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int start = Math.max(bombIndex - power, 0);
            int end = Math.min(bombIndex + power, numbers.size() - 1);

            if (end >= start) {
                numbers.subList(start, end + 1).clear();
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
