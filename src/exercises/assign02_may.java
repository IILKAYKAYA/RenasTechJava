package exercises;

import java.util.Scanner;

public class assign02_may {
    public static void main(String[] args) {


         // Your first assignment for today will be : please write a java program that will return median(middle) number of 3 numbers.
        //  Second assignment Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.

        //1.task
       // int num1 , num2, num3;
       // int num2=;
       // int num3=;

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the 1. number : " );
        int num1=scan.nextInt();

        System.out.println("enter the 2. number : ");
        int num2=scan.nextInt();

        System.out.println("enter the 3. number " );
        int num3=scan.nextInt();


        if (num1>num2 && num1<num3){
            System.out.println("number 1 is the middle of number");
        }
        if (num2>num1 && num2<num3){
            System.out.println("number 2 is the middle of number");
        }
        if(num3>num1 && num3<num2){
            System.out.println("number 3 is the middle of number");
        }





    }
}
