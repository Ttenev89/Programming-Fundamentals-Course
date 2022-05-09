package associativeArrays.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       TreeMap <String, Integer> statisticsPoints = new TreeMap<>();
        TreeMap<String, Integer> statisticsLanguage = new TreeMap<>();
        String input;

        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] command = input.split("-");
            if (command[1].equals("banned")) {
                statisticsPoints.remove(command[0]);
            } else {
                statisticsLanguage.put(command[1], !statisticsLanguage.containsKey(command[1]) ? 1 :
                        statisticsLanguage.get(command[1]) + 1);
                statisticsPoints.putIfAbsent(command[0], 0);
                if (statisticsPoints.get(command[0]) < Integer.parseInt(command[2])) {
                    statisticsPoints.put(command[0], Integer.parseInt(command[2]));
                }
            }
        }
        System.out.println("Results:");
        statisticsPoints.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        statisticsLanguage.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
    }
}
