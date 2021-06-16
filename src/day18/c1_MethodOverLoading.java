package day18;

public class c1_MethodOverLoading {

    public static void main(String[] args) {
        int num1=25;
        double num2=10.55;
        byte num3=2;

        method(num2);
        method(num3);
        method(num1);
        method("hello world");
        

        method(2);
        method(8);

    }
    public static void method(int a){
        System.out.println(a+ " is int ");


    }
    public static void method(double a){
        System.out.println(a+" is double");

    }

    public static void method(byte a){
        System.out.println(a+" is byte");
    }

    public static void method(String str){
        System.out.println(str+ " is String");

    }



}
