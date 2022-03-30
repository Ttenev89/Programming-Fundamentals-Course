package examPreparation.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher mirrorWord = pattern.matcher(input);

        int count = 0;

        List<String> mirror = new ArrayList<>();

        while (mirrorWord.find()) {
            count++;
            StringBuilder firstWord = new StringBuilder(mirrorWord.group("firstWord"));
            StringBuilder secondWord = new StringBuilder(mirrorWord.group("secondWord"));
            if (firstWord.reverse().compareTo(secondWord) == 0) {
                firstWord.reverse().append(" <=> ").append(secondWord);
                mirror.add(firstWord.toString());
            }
        }
        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(count + " word pairs found!");
        }
        if (mirror.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are: ");
            System.out.println(String.join(", ", mirror));
        }
    }
}
