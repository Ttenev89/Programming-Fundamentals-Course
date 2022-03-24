package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student2> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            Student2 useData = new Student2();
            useData.setFirstName(data[0]);
            useData.setLastName(data[1]);
            useData.setAge(Integer.parseInt(data[2]));
            useData.setHomeTown(data[3]);
            students.add(useData);

            if (isStudentExisting(students, data[0], data[1])) {
                int index = getExistStudentIndex(students, data[0], data[1]);
                students.set(index ,useData);
            } else {
                students.add(useData);
            }

            input = scanner.nextLine();
        }

        String townName = scanner.nextLine();

        for (Student2 student : students) {
            if (townName.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    private static int getExistStudentIndex(List<Student2> students, String datum, String datum1) {
        int index = students.size();
        for (Student2 student2 : students) {
            if (student2.getFirstName().equals(student2.firstName) && student2.getLastName().equals(student2.lastName)) {
                index = students.indexOf(student2);
            }
        }
        return index;
    }

    static boolean isStudentExisting(List<Student2> students, String datum, String datum1) {
        for (Student2 student2 : students) {
            if (student2.getFirstName().equals(student2.firstName) && student2.getLastName().equals(student2.lastName)) {
                return true;
            }
        }
        return false;
    }

    static class Student2 {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Student2() {

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

