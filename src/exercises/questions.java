package exercises;

import java.util.Scanner;

public class questions {

    public static void main(String[] args) {


        //Question 1
        //Write a program to print numbers from 1 to 10.
//Question 2
//Write a program to calculate the sum of first 10 natural number.
       //Question 3
       //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//Question 4
//Write a program to find the factorial value of any number entered through the keyboard.
//Question 5
//Two numbers are entered through the keyboard.
// Write a program to find the value of one number raised to the power of another.
// (Do not use Java built-in method)
//Question 6
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//For example, if the input is 12345, the output should be 54321.
//Question 7
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//Question 8
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.


        //Question 1
        //Write a program to print numbers from 1 to 10.

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //Question 2
        //Write a program to calculate the sum of first 10 natural number.

       int sum=0;
        for( int a=1 ; a<=10; a++ ){
           sum=sum+a;
        }
          System.out.println(sum);

        //Question 3
        //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication

        Scanner pnum=new Scanner(System.in);

        System.out.println("Enter one of the positive number please! :" );

        int in=pnum.nextInt();

        if (in>=1 ){
            System.out.println(in * in);

       }else{
            System.out.println("Number is not positive, Check the number Please !!!");
        }
        //Question 4
        //Write a program to find the factorial value of any number entered through the keyboard.






    }
    }


