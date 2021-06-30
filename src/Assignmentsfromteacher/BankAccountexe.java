package Assignmentsfromteacher;

public class BankAccountexe {

    public static void main(String[] args) {

        Bankexe person1=new Bankexe();
        Bankexe person2=new Bankexe();

        person1.setInformation("ilkay kaya",123456789,5000);
        person2.setInformation("Mustafa kaya",987654321,10000);
        person1.withdraw(100);
        person2.withdraw(100);
        person1.deposit(50);
        person2.deposit(50);

        System.out.println(person1);
        System.out.println(person1.balance);

        System.out.println(person2);
        System.out.println(person2.balance);
    }
}


