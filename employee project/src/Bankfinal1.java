import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    static int bankCode = 1001;

    BankAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        holderName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Transaction Failed! Minimum balance of ₹500 must be maintained.");
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Code: " + bankCode);
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class Bankfinal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(101, "Sanket", 5000);
        accounts[1] = new BankAccount(102, "Ravi", 3000);
        accounts[2] = new BankAccount(103, "Priya", 7000);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                BankAccount selected = null;
                for (BankAccount acc : accounts) {
                    if (acc.getAccountNumber() == accNo) {
                        selected = acc;
                        break;
                    }
                }

                if (selected == null) {
                    System.out.println("Account not found!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        selected.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        selected.withdraw(wd);
                        break;
                    case 3:
                        selected.display();
                        break;
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}


