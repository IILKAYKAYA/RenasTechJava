package day22;

import MyLibrary.Library;

//When a method is declared with static keyword, it is known as static method.
// The most common example of a static method is main( ) method.As discussed above,
// Any static member can be accessed before any objects of its class are created, and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.

public class staticMethods {


    int a=10; //instance variable
    static int b=20;  // static variable

    public static void main(String[] args) {//static method

        //System.out.println(a);//you cant call instance variable without object
        System.out.println(b);//20
        staticMethods obj1=new staticMethods();
        System.out.println(obj1.a);//10

        Library.stars();

        //instanceMethod();//you cant call instance method without object
        obj1.instanceMethod();//if you have object from class you can call your instance method

        methodStat();//if the method is static no need create an object

    }

    public void instanceMethod(){ //without static keyword your method will be instance
        System.out.println(a);
        //since method is instance we dont need to create an object to be able call instance variable
        //if method was static you would need create an object to be able call instance varible

        System.out.println(b);//b is static variable knows as global variables

        methodStat();
    }

    public static void methodStat(){
        System.out.println("hello");
    }
}
