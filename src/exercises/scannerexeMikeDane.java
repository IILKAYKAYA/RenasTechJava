package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scannerexeMikeDane {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name :");

        String name=scan.nextLine();

        System.out.println("Enter your age :");
        int age=scan.nextInt();

        System.out.println("Hey "+ name+" you are "+age +" years old.");


        System.out.println("enter num1");
        int num1= scan.nextInt();



        System.out.println("enter num2");
        int num2=scan.nextInt();

        System.out.println("enter num3");
        int num3=scan.nextInt();

        int sum=num1+num2+num3;

        System.out.println("sum of the 3 numbers are : "+sum);



    }



}
