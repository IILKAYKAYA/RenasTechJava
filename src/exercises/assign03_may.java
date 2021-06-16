package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class assign03_may {

    public static void main(String[] args) {

        //Task1 :create a java project that will check if number is even or odd
        //Task2 :create a java program that will check if number is divisible by 2 and 5 same time
        //please solve the tasks with 2 methods ( if statement and ternary statement)

        //Task 1 : create a java project that will check if number is even or odd

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the number please : ");

        int number=scan.nextInt();

        if(number % 2 == 0 ){
            System.out.println(number+ " is even number");

        }else if (number % 2 != 0){
            System.out.println(number + " is odd number ");
        }


        //Task2 :create a java program that will check if number is divisible by 2 and 5 same time

        Scanner scan2=new Scanner(System.in);

        System.out.println("enter the number please : ");

        int num=scan2.nextInt();

        if (num %2 == 0 && num % 5 ==0){
            System.out.println(num + " is divisible by 2 and 5 same time");
        }else{
            System.out.println(num+ " is  not divisible by 2 and 5 same time");

        }

        // ternary method

        String result=(num%2==0 && num % 5 == 0)? +num+ "is divisible by 2 and 5 same time"  : num + " is  not divisible by 2 and 5 same time";

        System.out.println(result) ;


    }
}
