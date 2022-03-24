package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersOne = Arrays.stream(scanner.nextLine().split(" "))
                                       .map(Double::parseDouble).collect(Collectors.toList());
        List<Double> numbersTwo = Arrays.stream(scanner.nextLine().split(" "))
                                       .map(Double::parseDouble).collect(Collectors.toList());
        List<Double> outputNumbers = new ArrayList<>();


        if(numbersOne.size() < numbersTwo.size()) {
            for (int i = 0; i < numbersOne.size(); i++) {
                outputNumbers.add(numbersOne.get(i));
                outputNumbers.add(numbersTwo.get(i));
            }

            for (int i = numbersOne.size(); i < numbersTwo.size(); i++) {
                outputNumbers.add(numbersTwo.get(i));
            }
        }
        else if(numbersTwo.size() < numbersOne.size())
        {
            for (int i = 0; i < numbersTwo.size(); i++)
            {
                outputNumbers.add(numbersOne.get(i));
                outputNumbers.add(numbersTwo.get(i));
            }

            for (int i = numbersTwo.size(); i < numbersOne.size(); i++)
            {
                outputNumbers.add(numbersOne.get(i));
            }
        }
        else{
            for (int i = 0; i < numbersOne.size(); i++) {
                outputNumbers.add(numbersOne.get(i));
                outputNumbers.add(numbersTwo.get(i));
            }
        }

        for (Double outputNumber : outputNumbers) {
            System.out.print(new DecimalFormat("0.###").format(outputNumber) + " ");

        }
    }
}