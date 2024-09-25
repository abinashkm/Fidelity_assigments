class Account {
    int accno;
    String name;
    double balance;

    // Constructor
    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Account No: " + accno + ", Name: " + name + ", Balance: " + balance);
    }
}

public class question2 {
    public static void main(String[] args) {
        Account acc = new Account(1001, "John Doe", 5000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.checkBalance();
    }
}
