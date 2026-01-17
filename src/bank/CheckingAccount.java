package bank;

public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void processWithdrawal(double amount) {
        balance = balance - amount;

        if (balance < 0) {
            balance = balance - 30.0;
            System.out.println("The balance became negative so the overdraft fee of $30 was applied.");
        }

        System.out.println("Balance after withdrawal: $" + String.format("%.2f", balance));
    }

    public void displayAccount() {
        System.out.println("Checking Account Details");
        System.out.println("Owner: " + getFirstName() + " " + getLastName());
        System.out.println("Account #: " + getAccountID());
        System.out.println("Balance: $" + String.format("%.2f", getBalance()));
        System.out.println("Rate: " + interestRate + "%");
    }
}
