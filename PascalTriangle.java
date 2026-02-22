import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print spaces for triangle shape
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1; // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Formula to calculate next number
            }
            System.out.println(); // Move to next row
        }
    }
}
