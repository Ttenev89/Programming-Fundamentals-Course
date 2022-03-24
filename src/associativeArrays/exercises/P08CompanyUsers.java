package associativeArrays.exercises;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] command = input.split(" -> ");
            companies.putIfAbsent(command[0], new ArrayList<>());
            if (!companies.get(command[0]).contains(command[1])) {
                companies.get(command[0]).add(command[1]);
            }
        }
        companies.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(id -> System.out.printf("-- %s%n", id));
        });
    }
}