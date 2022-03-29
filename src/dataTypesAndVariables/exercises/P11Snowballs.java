package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxSnowValue = 0;
        int maxSnowBallSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;

        for (int i = 0; i < n; i++) {

            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowBallValue = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);

            if (currentSnowBallValue > maxSnowValue) {
                maxSnowValue = currentSnowBallValue;
                maxSnowBallSnow = snowBallSnow;
                maxSnowBallTime = snowBallTime;
                maxSnowBallQuality = snowBallQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowBallSnow, maxSnowBallTime, maxSnowValue, maxSnowBallQuality);
    }
}
