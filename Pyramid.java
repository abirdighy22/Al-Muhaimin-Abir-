public class Pyramid {
    public static void main(String[] args) {

        int a = 5;

        for (int d = 1; d <= a; d++) {

            for (int j = 1; j <= a - d; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * d - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
