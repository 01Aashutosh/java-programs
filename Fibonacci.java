import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int N = scanner.nextInt();
        int[] fibonacci = new int[N + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i <= N; i++) {
            if (i == 0 || i == 1) {
                System.out.print(fibonacci[i]);
            } else {
                System.out.print(" " + fibonacci[i]);
            }
        }
    }
}
