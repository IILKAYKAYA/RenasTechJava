package exercises;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

import java.util.Scanner;

public class exerciseJulne20 {

    public static void main(String[] args) {
        //2. Write a Java program to print the sum of two numbers. Go to the editor
      /*  //Test Data:
        //74 + 36
        //Expected Output :
        //110

        int num1=74;
        int num2=36;
        int sum=num1+num2;
        System.out.println(sum);

        System.out.println("----------------");
        //3. Write a Java program to divide two numbers and print on the screen. Go to the editor
        //Test Data :
        //50/3
        //Expected Output :
        //16

        int dnum=50;
        int dnum2=3;
        int division=dnum/dnum2;
        System.out.println(division);

        System.out.println("-----------------");

        //4. Write a Java program to print the result of the following operations. Go to the editor
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        //Expected Output :
        //43
        //1
        //19
        //13

        int a=-5+8*6;
        int b=(55+9)%9;
        int c=20+(-3*5)/8;
        int d= 5+15/3*2-8%3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("-----------------");


        //5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        //Expected Output :
        //25 x 5 = 125

        Scanner scan=new Scanner(System.in);
        System.out.println("input first number : ");
        int number=scan.nextInt();
        System.out.println("input second number : ");
        int number2=scan.nextInt();

        System.out.println(number + "*" +number2 +"=" +number*number2);

        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

       // Scanner scan1=new Scanner(System.in);
        System.out.println("input first number : ");
        int input=scan.nextInt();

        System.out.println("Input second number : ");
        int input2=scan.nextInt();
        System.out.println(input+ " + " +input2+" = "+ (input+input2));
        System.out.println(input+ " - " +input2+" = "+ (input-input2));
        System.out.println(input+ " * " +input2+" = "+ (input*input2));
        System.out.println(input+ " / " +input2+" = "+ (input/input2));
        System.out.println(input+ " % " +input2+" = "+ (input%input2));*/

        //7. Write a Java program that takes a number as input and prints its multiplication table up to 10. Go to the editor
        //Test Data:
        //Input a number: 8
        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80
Scanner scan=new Scanner(System.in);

        System.out.println("input a number : ");
        int numb=scan.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(numb+"*" +i+ "=" +(numb*i));

        }


    }
}
