public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int d = 1;

        System.out.println("Fibonacci up to 100:");
        System.out.println(a);
        System.out.println(d);

        for (int fibo = a + d; fibo <= 100; fibo = a + d) {
            System.out.println(fibo);
            a = d;
            d = fibo;
        }
    }
}
