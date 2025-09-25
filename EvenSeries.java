import java.util.Scanner;

public class EvenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many even numbers you want: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " even numbers are:");

        for (int i = 1; i <= n; i++) {
            System.out.print((i * 2) + " ");
        }

        sc.close();
    }
}
