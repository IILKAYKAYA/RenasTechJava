package exercises;

import java.util.Scanner;

public class ifStatementsMikeDane {

    public static void main(String[] args) {


        //Your first assignment for today will be : please write a java program that will return median(middle) number of 3 numbers.
        
        // Second assignment Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.

        Scanner scan=new Scanner(System.in);

        System.out.println("enter 1. input : ");
        int num1=scan.nextInt();
        System.out.println("enter 2. input : ");
        int num2=scan.nextInt();
        System.out.println("enter 3. input : ");
        int num3=scan.nextInt();
        System.out.println("enter 4. input : ");
        int num4=scan.nextInt();
        int sum=num1+num2+num3+num4;
        System.out.println("avarage numbers : " +sum/4);
    }
}
