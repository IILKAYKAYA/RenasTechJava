package Assignmentsfromteacher;

public class BankOfAmerica {

    //create custom class called BankAccount for Bank of America' bank accounts:
    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance


    public static String bankName = "Bank Of America"; // static cunku banka ismi degismiyor
    public String firstName;  //instance public
    public String lastName;   //instance public

    //privite variables
    private String accountHolder;
    private long accountNumber;
    private double balance;



    //create a constructor

    public BankOfAmerica(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;
    }


    //encapsulate
    public void setAccountHolder(String firstName, String lastName) {
        this.accountHolder = firstName + " " + lastName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance() {

        return balance;
    }

    //action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance


    public void deposit(double money) {
        setBalance((balance + money));
    }

    public void withdraw(double money) {
        setBalance(balance-money);
    }

    public void availableBalance(){
        System.out.println("getBalance() = " + getBalance());
    }

    // toString
    public String toString(){
        return "full name is"+accountHolder+ "balance is "+balance;
    }



}