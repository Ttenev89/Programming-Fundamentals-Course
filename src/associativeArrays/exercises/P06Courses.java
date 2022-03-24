package associativeArrays.exercises;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> register = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" : ");
            register.putIfAbsent(command[0], new ArrayList<>());
            register.get(command[0]).add(command[1]);

            input = scanner.nextLine();
        }
        register.entrySet().stream().sorted((list1, list2) -> Integer.compare(list2.getValue().size(), list1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo).forEach(element -> System.out.printf("-- %s%n", element));
                });
    }
}
