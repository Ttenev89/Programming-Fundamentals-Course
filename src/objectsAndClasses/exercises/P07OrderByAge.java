package objectsAndClasses.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Peoples> peoplesList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] data = input.split(" ");
            Peoples peoples = new Peoples(data[0], data[1], Integer.parseInt(data[2]));
            peoplesList.add(peoples);

            input = scanner.nextLine();
        }

        peoplesList.stream()
                .sorted(Comparator.comparingInt(Peoples::getAge))
                .forEach(System.out::println);
    }

    static class Peoples {
        String name;
        String id;
        int age;

        public Peoples(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, id, age);
        }
    }
}
