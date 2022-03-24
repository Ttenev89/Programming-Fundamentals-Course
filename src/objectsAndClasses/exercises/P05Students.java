package objectsAndClasses.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentList.add(student);
        }

        studentList.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade())).
                forEach(student -> System.out.println(student.toString()));
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = age;
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

        public double getGrade() {

            return grade;
        }

        public void setGrade(double age) {

            this.grade = age;
        }

        @Override
        public String toString() {

            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }
    }
}
