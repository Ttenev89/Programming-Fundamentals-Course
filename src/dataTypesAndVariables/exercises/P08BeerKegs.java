package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String maxKeg = "";

        for (int i = 0; i < kegs; i++) {
            String type = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            double currentVolume = Math.PI * Math.pow(r, 2) * h;

            if (currentVolume > maxVolume) {
                maxVolume = currentVolume;
                maxKeg = type;
            }
        }

        System.out.println(maxKeg);
    }
}
