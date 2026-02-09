package bank;

public class AccountTesting {

    public static void main(String[] args) {

        CheckingAccount myAcct = createAccount("Christian", "Johnson", 47219, 1.9);
        myAcct.deposit(385.75);
        myAcct.withdrawal(40.25);
        myAcct.displayAccount();
        myAcct.accountSummary();

        CheckingAccount overdraftAcct = createAccount("Chris", "J", 88002, 1.3);
        overdraftAcct.deposit(120.00);
        overdraftAcct.processWithdrawal(155.50);
        overdraftAcct.displayAccount();

        CheckingAccount zeroAcct = createAccount("Christian", "Johnson", 30303, 2.4);
        zeroAcct.deposit(75.00);
        zeroAcct.withdrawal(75.00);
        zeroAcct.displayAccount();

        CheckingAccount multiAcct = createAccount("Christian", "Johnson", 90909, 2.1);
        multiAcct.deposit(20.00);
        multiAcct.deposit(35.50);
        multiAcct.withdrawal(10.25);
        multiAcct.displayAccount();
    }

    private static CheckingAccount createAccount(String firstName, String lastName, int accountID, double interestRate) {
        CheckingAccount acct = new CheckingAccount();
        acct.setFirstName(firstName);
        acct.setLastName(lastName);
        acct.setAccountID(accountID);
        acct.setInterestRate(interestRate);
        return acct;
    }
}

