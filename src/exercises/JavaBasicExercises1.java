package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaBasicExercises1 {

    public static void main(String[] args) {

//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
//Expected Output :
//Hello
//Alexandra Abramov

        System.out.println("Hello");
        System.out.println("Alexandra Abramov");


//2. Write a Java program to print the sum of two numbers. Go to the editor
//Test Data:
//74 + 36
//Expected Output :
//110
        int n1=74;
        int n2=36;
        int sum=(n1+n2);
        System.out.println(sum);

//3. Write a Java program to divide two numbers and print on the screen. Go to the editor
//Test Data :
//50/3
//Expected Output :
//16
        int div=50/3;
        System.out.println(div);


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
        int c=20+ -3*5 /8;
        int d=5+15/3*2-8%3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

        System.out.println("*****task5*****");

     /* Scanner scan = new Scanner(System.in);
        System.out.println("Input first number :" );
        int input=scan.nextInt();
        System.out.println("Input second number :" );
        int input2=scan.nextInt();
        System.out.println(input + " * " + input2 + " = " + input*input2 );

      */


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

        System.out.println("******Task6******");
        int fnum=125;
        int snum=24;

        System.out.println(fnum + " + " + snum+ " = "+(fnum+snum));
        System.out.println(fnum + " - " + snum+ " = "+(fnum-snum));
        System.out.println(fnum + " * " + snum+ " = "+(fnum*snum));
        System.out.println(fnum + " / " + snum+ " = "+(fnum/snum));
        System.out.println(fnum + " % " + snum+ " = "+(fnum%snum));



//7. Write a Java program that takes a number as input and prints its multiplication table up to 10. Go to the editor
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80


        // Scanner in = new Scanner(System.in);
        //
        //        System.out.print("Input a number: ");
        //        int num1 = in.nextInt();
        //
        //        for (int i=0; i< 10; i++){
        //            System.out.println(num1 + " x " + (i+1) + " = " +
        //                    (num1 * (i+1)));

        System.out.println("*******Task7*******");

        Scanner scan2=new Scanner(System.in);

        System.out.println("Input the number :");

        int n= scan2.nextInt();

        for (int i=1 ; i <=10 ; i++){

            System.out.println(n+ " * " + i + " = " + (n*i));
        }

//8. Write a Java program to display the following pattern. Go to the editor
//Sample Pattern :
//
//   J    a   v     v  a
//   J   a a   v   v  a a
//J  J  aaaaa   V V  aaaaa
// JJ  a     a   V  a     a

        System.out.println();
        System.out.println("********Task8********");

        System.out.println("     J  a   v     v  a");
        System.out.println("    J  a a   v   v  a a");
        System.out.println("   J  aaaaa   V V  aaaaa");
        System.out.println("  J  a     a   V  a     a");


        //9. Write a Java program to compute the specified expressions and print the output. Go to the editor
        //Test Data:
        //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        //Expected Output
        //2.138888888888889

        System.out.println();
        System.out.println("*********Task9*********");


        System.out.println((25.5 * 3.5 - 3.5 * 3.5 )/ (40.5 - 4.5));




        //10. Write a Java program to compute a specified formula. Go to the editor
        //Specified Formula :
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        //Expected Output
        //2.9760461760461765

        System.out.println();
        System.out.println("**********Task10**********");

        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));





    }
}
