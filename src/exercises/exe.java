package exercises;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {

        //task 1
        //create a java program that will check months string and depends on number you passed
        //you should be able to see month name
        //example : 2 feb
        //3 :mar
        //numbers should be between 1 to 12 (included)
        //if numbers are not between 1 to 12 print invalid number
        //and give user 3 attempt if it is still not between 1 to 12 then stop whole system


        String[] months= {"1 :January","2 :February","3 :March","4 :April","5 :May","6 :June","7 :July","8 :August","9 :September","10 :October","11 :November","12 :December"};

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number");

        int number=scan.nextInt();

        int attempt=1;

        while (number>12|| number<1){

            System.out.println("Incorrect. Your remaining trial:" + (3-attempt));

            number=scan.nextInt();

            attempt++;

           if (attempt==3 && number>12|| number<1 ){
                System.out.println("user tired 3 times ");
                System.out.println("System is locked");
                System.exit(0);
            }
        }
        String result=months[number-1];

        System.out.println(result);
    }
}
