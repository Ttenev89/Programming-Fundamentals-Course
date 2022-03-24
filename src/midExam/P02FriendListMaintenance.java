package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> usernames = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        int blacklistCount = 0;
        int lost = 0;

        while (!input.equals("Report")) {
            List<String> command = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String firstCommand = command.get(0);

            switch (firstCommand) {
                case "Blacklist":
                    String name = command.get(1);
                    int indexName = usernames.indexOf(name);
                    if (usernames.contains(name)) {
                        blacklistCount++;
                        usernames.remove(name);
                        usernames.add(indexName, "Blacklisted");
                        System.out.println(name + " was blacklisted.");
                    } else {
                        System.out.println(name + " was not found.");
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command.get(1));
                    if (index >= 0 && index < usernames.size()) {
                        String name1 = usernames.get(index);
                        if (!usernames.get(index).equals("Blacklisted") && !usernames.get(index).equals("Lost")) {
                            lost++;
                            usernames.set(index, "Lost");
                            System.out.println(name1 + " was lost due to an error.");
                        }
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(command.get(1));
                    String newName = command.get(2);

                    if (index1 >= 0 && index1 < usernames.size()) {
                        System.out.println(usernames.get(Integer.parseInt(command.get(1))) + " changed his username to " + newName + ".");
                        usernames.set(index1, newName);
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        System.out.println("Blacklisted names: " + blacklistCount);
        System.out.println("Lost names: " + lost);
        System.out.println(String.join(" ", usernames));

    }
}