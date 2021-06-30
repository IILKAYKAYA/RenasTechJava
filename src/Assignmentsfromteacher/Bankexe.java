package Assignmentsfromteacher;


/*practice task:
        create a custom class for bank account
        attrubutes: accountHolder(String), accountNumber(long), balance(double)
        actions: totalBalance(), withDraw( amount ), deposit( amount )
        toString()
        create a class called bankAccountObject to call BankAccount methods,variables.
        Ex : if i deposit 50 dollars my balance should increase 50 dollars
        : if i withdraw 100 dollars my balance should decrease for 100 dollars
        : to check the balance use totalBalance method
        */


public class Bankexe {

    String accountHolder;
    long accountNumber;
    double balance;

    public void setInformation(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;


    }

    public void totalBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdraw) {
        this.balance = balance - withdraw;
    }

    public void deposit(double deposit) {
        this.balance = balance + deposit;
    }

    public String toString() {
        return "Bank customer: "+accountNumber + " , " + accountHolder + " ," + " has $$$" + balance;
    }
}
