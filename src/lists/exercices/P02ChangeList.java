package lists.exercices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")){

            String[] input = line.split("\\s+");
            String cmd = input[0];


            int element = Integer.parseInt(input[1]);
            if (cmd.equals("Delete")){


                while (numbers.contains(element)){
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int index = Integer.parseInt(input[2]);
                if (index <= numbers.size()){
                    numbers.add(index,element);
                }


            }

            line = scanner.nextLine();
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
