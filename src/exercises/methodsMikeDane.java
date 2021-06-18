package exercises;


import java.util.Scanner;

public class methodsMikeDane {

    public static void main(String[] args) {




        String myname="Ilkay";
        sayHi("beren", 62.3);
        sayHi("mustafa", 15.5);
        sayHi("eymen",22.8);
        System.out.println("bottom line");
        askAge(6);

    }

    public static void sayHi(String name, double weight){

        System.out.println("Hello "+name+ " "+weight);

    }

    public static void askAge(int age ){
        System.out.println("enter your age");
        Scanner age1=new Scanner(System.in);
        int yas=age1.nextInt();
        System.out.println("you are : "+yas+" years old");
        System.out.println("you are :" +age);


    }}
