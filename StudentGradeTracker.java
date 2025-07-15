import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter grade: ");
            int grade = sc.nextInt();

            students.add(name);
            grades.add(grade);
        }

        int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int grade : grades) {
            total += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }

        System.out.println("\n--- Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i) + ": " + grades.get(i));
        }
        System.out.println("Average: " + (total / (double)n));
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}
