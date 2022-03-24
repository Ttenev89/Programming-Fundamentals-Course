package midExam;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBiscuitPerWorker = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int biscuitsOfCompetition = Integer.parseInt(scanner.nextLine());

        int productionPerDay = numberBiscuitPerWorker * workersCount;
        int sum = 0;

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                sum += Math.floor(0.75 * productionPerDay);
            } else {
                sum += productionPerDay;
            }
        }

        System.out.printf("You have produced %d biscuits for the past month.%n", sum);
        if (sum > biscuitsOfCompetition) {
            double percent = 1.0 * (sum - biscuitsOfCompetition) / biscuitsOfCompetition * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else {
            double percent = 1.0 * (biscuitsOfCompetition - sum) / biscuitsOfCompetition * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percent);
        }
    }
}
