package regularExpressions.exercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Race {

    public static int index = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> raceInfo = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toMap(s -> s, s -> 0, (a, b) -> a, LinkedHashMap::new));
        String input;

        while (!"end of race".equals(input = scanner.nextLine())) {

            int sum = 0;

            StringBuilder name = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                } else if (Character.isUpperCase(input.charAt(i))) {
                    name.append(input.charAt(i));
                } else if (Character.isLowerCase(input.charAt(i)) && name.length() > 0) {
                    name.append(input.charAt(i));
                }
            }
            if (raceInfo.containsKey(String.valueOf(name))) {
                raceInfo.put(String.valueOf(name), raceInfo.get(String.valueOf(name)) + sum);
            }
        }
        String[] num = new String[]{"1st", "2nd", "3rd"};
        raceInfo.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                .forEach(entry -> {
                    System.out.printf("%s place: %s%n", num[index], entry.getKey());
                    index++;
                });
    }
}

