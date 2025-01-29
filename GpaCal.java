import java.util.Scanner;

public class GpaCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the course name: ");
            String courseName = scanner.next();

            System.out.print("Enter the course credits: ");
            int credits = scanner.nextInt();

            System.out.print("Enter the course grade (A, B, C, D, F): ");
            String grade = scanner.next().toUpperCase();

            double gradePoints = getGradePoints(grade);
            totalGradePoints += gradePoints * credits;
            totalCredits += credits;

            System.out.println("Course: " + courseName);
            System.out.println("Credits: " + credits);
            System.out.println("Grade: " + grade);
            System.out.println("Grade Points: " + gradePoints);
            System.out.println();
        }

        double gpa = totalGradePoints / totalCredits;
        System.out.println("Total Grade Points: " + totalGradePoints);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("GPA: " + String.format("%.2f", gpa));
    }

    public static double getGradePoints(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}
