package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            Student useData = new Student();
            useData.setFirstName(data[0]);
            useData.setLastName(data[1]);
            useData.setAge(Integer.parseInt(data[2]));
            useData.setHomeTown(data[3]);
            students.add(useData);

            input = scanner.nextLine();
        }

        String townName = scanner.nextLine();

        for (Student student : students) {
            if (townName.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Student() {

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

    }
}
