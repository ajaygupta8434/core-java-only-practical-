import java.util.Scanner;

public class CheckNumberEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        // Check for equality
        if (a == b) {
            System.out.print("First and Second numbers are equal, enter a new value for second: ");
            b = sc.nextInt();

            // Check again after new input
            if (a == b || b == c) {
                System.out.print("Number still clashes, enter another value for second: ");
                b = sc.nextInt();
            }
        } else if (a == c) {
            System.out.print("First and Third numbers are equal, enter a new value for third: ");
            c = sc.nextInt();

            // Check again after new input
            if (c == a || c == b) {
                System.out.print("Number still clashes, enter another value for third: ");
                c = sc.nextInt();
            }
        } else if (b == c) {
            System.out.print("Second and Third numbers are equal, enter a new value for third: ");
            c = sc.nextInt();

            // Check again after new input
            if (c == a || c == b) {
                System.out.print("Number still clashes, enter another value for third: ");
                c = sc.nextInt();
            }
        }

        System.out.println("\nFinal numbers are: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        sc.close();
    }
}
