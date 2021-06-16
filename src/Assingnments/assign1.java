package Assingnments;

import java.sql.SQLOutput;
import java.util.Formattable;
import java.util.Scanner;

public class assign1 {

    public static void main(String[] args) {



    //1. write a program that ask user to enter sentence.
    //Then print out the first and last characters

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the sentence : ");

        String input1=scan.nextLine();

        String result=" ";

        for(int i=0; i <= input1.length()-1; i++){
           result += i;

        }System.out.println(" first character is :" +input1.charAt(0)+ " Last character is " +input1.charAt(input1.length()-1));



        //2. Ask user to enter a word. Print true if the first and last characters of the string are same characters, print false otherwise.
    //           Input:
    //               abba
    //           Output:
    //               true


        Scanner scan2=new Scanner(System.in);

        System.out.println("Please enter the word : ");

        String input2=scan2.nextLine();

        String result2="";
        boolean a=true;
        boolean b=false;

        for (int i=0; i<=input2.length()-1; i++){
            result2 +=i;

        } if(input2.charAt(0) == input2.charAt(input2.length()-1)){
            System.out.println(a);

        }else{
            System.out.println(b);
        }

    //(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA


        String word=("ABCD");
                    //0123

        System.out.println(word);

        String reverse=""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.println(reverse);



//(String) Same Letters
//Write a return method that check if a string is build out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false:

//(String) Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

//(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

//(Array) Find Maximum
//Write a method that can find the maximum number from an int Array

//(Array) Find Minimum
//Write a method that can find the maximum number from an int Array

//(Array) Concat two arrays
//Write a return method that can concate two arrays
}
}