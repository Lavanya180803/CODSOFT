import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjectCount = sc.nextInt();

        int[] marks = new int[subjectCount];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validate marks are within 0 to 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                System.out.print("Re-enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / subjectCount;

        // Determine grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Display the results
        System.out.println("\n----- Report Card -----");
        System.out.println("Total Marks: " + totalMarks + " out of " + (subjectCount * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
