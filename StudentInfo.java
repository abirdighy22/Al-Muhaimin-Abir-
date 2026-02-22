import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Student ID
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Input Student Name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Input CGPA
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        // Output
        System.out.println("\n--- Student Information ---");
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
