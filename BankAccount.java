class BankAccount {
    String holder;
    double balance;

    BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void accountInfo() {
        System.out.println(holder + "'s balance: " + balance);
    }

    double calculateInterest() {
        return balance * 0.03; // 3% interest
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.05; // 5% interest
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    double calculateInterest() {
        return 0; // no interest
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("Rohan", 10000);
        BankAccount a2 = new CurrentAccount("Sami", 20000);

        a1.accountInfo();
        System.out.println("Interest: " + a1.calculateInterest());

        a2.accountInfo();
        System.out.println("Interest: " + a2.calculateInterest());
    }
}
