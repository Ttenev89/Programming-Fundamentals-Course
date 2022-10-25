import java.util.Scanner;

public class Educational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 20) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < (i + n) - 1 ; j++) {
                    System.out.print(j);
                }
                System.out.println((i + n) - 1);
            }
        }
    }
}
