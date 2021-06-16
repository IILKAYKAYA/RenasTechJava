package exercises;

import java.util.Locale;

public class assingn10 {
    public static void main(String[] args) {




    /*Task :

    Write a Java program to display the middle character of a string in uppercase
        --> If the length of the string is even number  String will have two middle characters.
        --> If the length of the string is odd number String  will have one middle character.
            example :
    Input 1 :  World             Output 1:Middle character is: R
    Input 2 :  computer          Output 2:Middle character is: PU
                .....

    Task : Create a java program that will check given string and if string starts or ends with 'a' or 'A' remove it from string.
            if it is not leave it as it is :
    examples :
            if string is Hello  output should be Hello
    if string is JavA  output should be jav
    if string is Ajava  output should be jav
    .....
    Hint : Try with different cases to make sure your code is working correctly .
            if you want to try with multiple words to you can create scanner and try multiple times with different words
 */
       // task 1:
       //  example :
       //  Input 1 :  World             Output 1:Middle character is: R
       //  Input 2 :  computer          Output 2:Middle character is: PU

        String str1 = "World";
       //
        // char ch=str1.charAt(0);
        String a=str1.toUpperCase();
        System.out.println("Middle character of world is :" +a.charAt(2) );

        String str2 = "computer";
        char ch2=str2.charAt(0);
        String b=str2.toUpperCase();
        System.out.println("Middle character of world is :"+ b.substring(3,5));

        //Task 2 : Create a java program that will check given string and if string starts or ends with 'a' or 'A' remove it from string.
        // if it is not leave it as it is :
        // examples :
        // if string is JavA  output should be jav
        // if string is Ajava  output should be jav



        String str3= "JavA";

        boolean a1=(str3.startsWith("a") && str3.endsWith("A"));



    }

}
       // char a = str1.charAt(2);
       // String b= str1.toUpperCase(2);

       // System.out.println(a+b);



