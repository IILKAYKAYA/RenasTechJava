package day25;

public class CapitalOne {

    public static void main(String[] args) {
        //we want to create customers for capitalone by using BankAccount class

        BankAccount rustemAccount=new BankAccount("Rustem","Erdem");

        System.out.println("rustemAccount.firstName = " + rustemAccount.firstName);
        System.out.println("rustemAccount.getAccountHolder() = " + rustemAccount.getAccountHolder());


        System.out.println("getBalance() = " + rustemAccount.getBalance());

        rustemAccount.setBalance(150);
        System.out.println("getBalance() = "+rustemAccount.getBalance());

        rustemAccount.deposit(150);
        rustemAccount.avaliableBalance();
        rustemAccount.withdraw(100);
        rustemAccount.avaliableBalance();


        rustemAccount.setAccountNumber(23112432);
        System.out.println("rustemAccount.getAccountNumber() = " + rustemAccount.getAccountNumber());


        System.out.println(rustemAccount);
    }
}
