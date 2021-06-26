package Assingnments;

import java.util.Arrays;

public class SameLettersStringReturn {


    //Write a return method that check
    // if a string is build out of the same letters as another string.
    //Ex:  same("abc",  "cab"); -> true
    //same("abc",  "abb"); -> false:


    public static void main(String[] args) {

        sameLetters("abc", "cba");
        sameLetters("xyz", "mlk");

    }
    public static boolean sameLetters(String str1, String str2){

        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String a="";
        for(char each1 :arr1){
            a +=each1;
        }
        String b="";
        for(char each2 :arr2){
            b +=each2 ;
        }
        boolean bool=a.equals(b);
        if(bool==true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return bool;

    }
}
