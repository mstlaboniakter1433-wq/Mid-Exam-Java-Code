class Account {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    double interest_rate;

    void addInterest() {
        balance += balance * interest_rate;
    }
}

class CurrentAccount extends Account {
    double overdraft_limit;

    void checkOverdraft() {
        if (balance < -overdraft_limit) {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class Umlacc {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(1000);
        s.interest_rate = 0.1;
        s.addInterest();
        System.out.println(s.getBalance());

        CurrentAccount c = new CurrentAccount();
        c.overdraft_limit = 500;
        c.withdraw(600);
        c.checkOverdraft();
    }
}