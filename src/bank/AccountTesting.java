package bank;

public class AccountTesting {

    public static void main(String[] args) {

        System.out.println("Deposit & Withdraw test");

        CheckingAccount myAcct = new CheckingAccount();
        myAcct.setFirstName("Christian");
        myAcct.setLastName("Johnson");
        myAcct.setAccountID(47219);
        myAcct.setInterestRate(1.9);

        myAcct.deposit(385.75);
        myAcct.withdrawal(40.25);

        myAcct.displayAccount();
        myAcct.accountSummary();


        System.out.println("\nOverdraft Test");

        CheckingAccount overdraftAcct = new CheckingAccount();
        overdraftAcct.setFirstName("Chris");
        overdraftAcct.setLastName("J");
        overdraftAcct.setAccountID(88002);
        overdraftAcct.setInterestRate(1.3);

        overdraftAcct.deposit(120.00);
        overdraftAcct.processWithdrawal(155.50);
        overdraftAcct.displayAccount();


        System.out.println("\nZero Test");

        CheckingAccount zeroAcct = new CheckingAccount();
        zeroAcct.setFirstName("Christian");
        zeroAcct.setLastName("Johnson");
        zeroAcct.setAccountID(30303);
        zeroAcct.setInterestRate(2.4);

        zeroAcct.deposit(75.00);
        zeroAcct.withdrawal(75.00);
        zeroAcct.displayAccount();


        System.out.println("\nDeposits Test");

        CheckingAccount multiAcct = new CheckingAccount();
        multiAcct.setFirstName("Christian");
        multiAcct.setLastName("Johnson");
        multiAcct.setAccountID(90909);
        multiAcct.setInterestRate(2.1);

        multiAcct.deposit(20.00);
        multiAcct.deposit(35.50);
        multiAcct.withdrawal(10.25);
        multiAcct.displayAccount();
    }
}
