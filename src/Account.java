//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Account {
//    private String accountNumber;
//    private String accountHolderName;
//    private double balance;
//    private String transactionHistory;
//
//    public void initializeAccount(String accountNumber, String accountHolderName, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//        this.balance = initialBalance;
//        this.transactionHistory = "";
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//        transactionHistory += "Deposit: " + amount + "\n";
//    }
//
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            transactionHistory += "Withdrawal: " + amount + "\n";
//        } else {
//            System.out.println("Insufficient funds");
//        }
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getTransactionHistory() {
//        return transactionHistory;
//    }
//}
//
//class AccountManagementSystem {
//    private ArrayList<Account> accounts;
//
//    public AccountManagementSystem() {
//        accounts = new ArrayList<>();
//    }
//
//    public void displayMenu() {
//        System.out.println("1. Add Account");
//        System.out.println("2. Display All Accounts");
//        System.out.println("3. Deposit Funds");
//        System.out.println("4. Withdraw Funds");
//        System.out.println("5. Exit");
//    }
//
//    public void addAccount() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter account number: ");
//        String accountNumber = scanner.nextLine();
//        System.out.print("Enter account holder name: ");
//        String accountHolderName = scanner.nextLine();
//        System.out.print("Enter initial balance: ");
//        double initialBalance = scanner.nextDouble();
//        Account newAccount = new Account();
//        newAccount.initializeAccount(accountNumber, accountHolderName, initialBalance);
//        accounts.add(newAccount);
//    }
//
//    public void displayAllAccounts() {
//        for (Account account : accounts) {
//            System.out.println("Account Number: " + account.getAccountNumber());
//            System.out.println("Account Holder Name: " + account.getAccountHolderName());
//            System.out.println("Balance: " + account.getBalance());
//            System.out.println("Transaction History: \n" + account.getTransactionHistory());
//            System.out.println();
//        }
//    }
//
//    public void depositFunds() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter account number: ");
//        String accountNumber = scanner.nextLine();
//        int index = findAccountIndex(accountNumber);
//        if (index != -1) {
//            System.out.print("Enter deposit amount: ");
//            double amount = scanner.nextDouble();
//            accounts.get(index).deposit(amount);
//            System.out.println("Deposit successful");
//        } else {
//            System.out.println("Account not found");
//        }
//    }
//
//    public void withdrawFunds() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter account number: ");
//        String accountNumber = scanner.nextLine();
//        int index = findAccountIndex(accountNumber);
//        if (index != -1) {
//            System.out.print("Enter withdrawal amount: ");
//            double amount = scanner.nextDouble();
//            accounts.get(index).withdraw(amount);
//            System.out.println("Withdrawal successful");
//        } else {
//            System.out.println("Account not found");
//        }
//    }
//
//    private int findAccountIndex(String accountNumber) {
//        for (int i = 0; i < accounts.size(); i++) {
//            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        AccountManagementSystem system = new AccountManagementSystem();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            system.displayMenu();
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    system.addAccount();
//                    break;
//                case 2:
//                    system.displayAllAccounts();
//                    break;
//                case 3:
//                    system.depositFunds();
//                    break;
//                case 4:
//                    system.withdrawFunds();
//                    break;
//                case 5:
//                    return;
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }
//    }
//}
