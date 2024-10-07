import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Create a new account
    public void createAccount(String accountHolderName, String accountNumber) {
        BankAccount newAccount = new BankAccount(accountHolderName, accountNumber);
        accounts.add(newAccount);
        System.out.println("Account created successfully!");
    }

    // Find an account by account number
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    // Display all accounts
    public void displayAllAccounts() {
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}
