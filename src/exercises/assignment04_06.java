package exercises;

import java.util.Scanner;

public class assignment04_06 {

    public static void main(String[] args) {

        //Task 1
        //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        //Task 2
        //Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        //Tak 3
        //Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....

        //Task 4
//use a do while loop to implement the Guessing the Number game. The program gives as many tries as the user needs to guess the number.
//if guess is correct print "You guessed the correct number.");
// if guess is smaller then your number print "Your guess is lower than the number.\nGuess again!");
// if guess is higher then your number print  "Your guess is higher than the number.\nGuess again!");

        //task 5 print below figure
//a b c d e f g h i j k l m n o p q r s t u v w x y z
//a b c d e f g h i j k l m n o p q r s t u v w x y
//a b c d e f g h i j k l m n o p q r s t u v w x
//...
//...
//a b c
//a b
//a

        //Task 1
        //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

    /*    Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number please! : ");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("You entered positive number : " + number);

        } if (number < 0) {
            System.out.println("You entered negative number : " + number);

        } if (number==0){
            System.out.println("You entered zero : " +number );
        }



        //Task 2
        //Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter the first number please : ");
        int number2=scan2.nextInt();
        System.out.println("Enter the second number please : ");
        int number3=scan2.nextInt();

        if(number2 > number3){
            System.out.println(number2 +" is the largest number");

        }
        if (number2 <number3){
            System.out.println(number2 + " is the smaller number");
        }
*/
        //Tak 3
        //Write a program to print Fibonacci series of n terms where n is input by user :
        //0 1 1 2 3 5 8 13 24 .....
/*
        int k=0;
        int x=1;
        int y=1;
        System.out.print(k+ " "+ x +" "+y+" ");
        while (x<=1000) {
            k = x + y;
            System.out.print(k + " ");
            x = y;
            y = k;
            k = x + y;
            System.out.print(k + " ");
        }*/

        //Task 4
        //use a do while loop to implement the Guessing the Number game. The program gives as many tries as the user needs to guess the number.
        //if guess is correct print "You guessed the correct number.");
        // if guess is smaller then your number print "Your guess is lower than the number.\nGuess again!");
        // if guess is higher then your number print  "Your guess is higher than the number.\nGuess again!");
/*
       Scanner scan=new Scanner(System.in);

        int x=15;
        int guess ;

        do {
            System.out.println("please guess the number : ");

            guess = scan.nextInt();

            if (guess > x) {

                System.out.println("Your guess is higher than the number. \n Guess again!");

            }
            else if (guess < x) {
                System.out.println("Your guess is smaller than the number. \n Guess again!");
            }

            }
        while (guess != x) ; {
            System.out.println("\" You guess the correct number! Bravo !!!\"");


        }
*/
        //task 5 print below figure
//a b c d e f g h i j k l m n o p q r s t u v w x y z
//a b c d e f g h i j k l m n o p q r s t u v w x y
//a b c d e f g h i j k l m n o p q r s t u v w x
//...
//...
//a b c
//a b
//a

        for (char i = 'z'; i >= 'a'; i--) {

            for (char j = 'a'; j <= i; j++) {

                System.out.print(" " +j+ " ");
            }
            System.out.println();


            //  for (char ch = 'z'; ch >= 'a'; ch--) {
            //     for (char ch1 = 'a'; ch1 <= ch; ch1++) {
            //         System.out.print(ch1);
            //    }
            //    System.out.println();

        }
    }
}