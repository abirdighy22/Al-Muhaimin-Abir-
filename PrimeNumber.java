import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        boolean prime = true;
        if(num <= 1)
            prime = false;
        else {
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if(prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}
