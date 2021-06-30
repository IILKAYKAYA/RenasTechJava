package day25;

public class BankAccount {
    //create custom class called BankAccount for CapitalOne bank accounts:
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

    //			public variables:  bankName, firstName, lastName
    public static String bankName="CapitalOne"; //static public : since we will work only capitalone
    //bankname will be a unique name thats why we made static
    public String firstName; //instance public : since we will have multiple customers
    //that means we will need to create multiple copy from first name object
    public String lastName;  //instance public


    //	 		private variables: accountHolder, accountNumber, balance
    private String accountHolder;
    private long accountNumber;
    private double balance;



    //create a constructor that can initialize firstName ,last name and account holder
    public BankAccount(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName + " " +lastName;
    }

    //encapsulate all the private data accountHolder, accountNumber, balance\
    public void setAccountHolder(String firstName , String  lastName){
        this.accountHolder=firstName + " " + lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }


    //action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance



    public void deposit(double money){
        //now your balnce needs to be updated
        setBalance(balance+ money);

        //balnce 100
        //deposit 20
        //new balance will be setBalance(balance + money )

    }

    public void withdraw(double money){
        setBalance(balance-money);
    }

    public void avaliableBalance(){
        System.out.println("Avaliable Balance is : " + getBalance() );
    }


    //	 				toString: returns the full name and balance

    public String toString(){
        return "Full name  is :" + getAccountHolder() + " Balance is : " +getBalance();
    }

}

