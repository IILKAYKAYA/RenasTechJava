package day23;
public class StaticBlock {
    int instVariable = 10;
    static int statVrb = 20;

    public static void main(String[] args) {
        int localvrb = 30;
        System.out.println("This is main method");
        methodStatic(); //we dont need to create object to call static methods
        System.out.println("hello");
//
        StaticBlock sb = new StaticBlock(); //this object will run instance block
//
        sb.methodInstan();
//
        StaticBlock sb2 = new StaticBlock();
        //your instance block will be excuted one more time since you created another object

    }

    static {
        //this is a static block
        System.out.println("This is static block");
        //no mather what always static block will be excuted before eveything
    }

    {
        //this is instance block
        System.out.println("This is instance block");
    }


    public static void methodStatic() {
        System.out.println("This is static method");
    }

    public void methodInstan() {
        System.out.println("This is instance method");

    }
}
