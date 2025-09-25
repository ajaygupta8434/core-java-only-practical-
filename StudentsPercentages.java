import java.util.Scanner;

public class StudentsPercentages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 5; // total students
        int subjects = 5; // total subjects

        for (int s = 1; s <= students; s++) {
            System.out.println("\nEnter marks for Student " + s + ":");

            int totalMarks = 0;
            for (int sub = 1; sub <= subjects; sub++) {
                System.out.print("  Subject " + sub + ": ");
                int marks = sc.nextInt();
                totalMarks += marks;
            }

            double percentage = (totalMarks / (subjects * 100.0)) * 100;

            int bonus = 0;
            if (percentage >= 80) {
                bonus = 10;
            } else if (percentage >= 75 && percentage < 80) {
                bonus = 5;
            }

            int finalMarks = totalMarks + bonus;

            // Output for this student
            System.out.println("\nResult of Student " + s + ":");
            System.out.println("Total Marks (without bonus): " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Bonus Marks Awarded: " + bonus);
            System.out.println("Final Marks (with bonus): " + finalMarks);
            System.out.println("----------------------------------");
        }

        sc.close();
    }
}
