package exercises;

import java.util.Scanner;

public class JavaBasicExercise2 {

    public static void main(String[] args) {

        //11. Write a Java program to print the area and perimeter of a circle. Go to the editor
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586





        //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor


        Scanner scan =new Scanner(System.in);

        System.out.println("Input number1 : ");
        int n1=scan.nextInt();

        System.out.println("input second number : ");
        int n2=scan.nextInt();

        System.out.println("input third number :");
        int n3=scan.nextInt();

        int avarage= (n1+n2+n3)/3;
        System.out.println("Avarage of the three numbers : " + avarage);


        //32. Write a Java program to compare two numbers. Go to the editor
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        //
        //25 != 39
        //25 < 39
        //25 <= 39

        Scanner scan2=new Scanner(System.in);

        System.out.println("input first integer : ");
        int in=scan2.nextInt();

        System.out.println("Input second integer: ");
        int in2=scan2.nextInt();

        if (in != in2 ) {

            System.out.println(in + " != " + in2);
        }
        if (in < in2 ){

            System.out.println(in+ " < " +in2);
    }
        if (in <= in2 ){
            System.out.println(in + " <= " + in2);
        }
}
}
