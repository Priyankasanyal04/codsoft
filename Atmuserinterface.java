import java.util.Scanner;

class Atm {
    private BankAccount bankAccount;
    private Scanner sc;

    public Atm(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        sc = new Scanner(System.in);
    }

    void menu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Enter a choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (bankAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + bankAccount.getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        bankAccount.deposit(amount);
        System.out.println("Deposit successful. New balance: $" + bankAccount.getBalance());
    }

    private void checkBalance() {
        System.out.println("Current balance: $" + bankAccount.getBalance());
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

public class Atmuserinterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        Atm atm1 = new Atm(account);
        atm1.menu();
    }
}
