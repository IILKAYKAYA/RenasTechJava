package day20;

import java.util.Arrays;

public class c1_SumDigitsFromString {

    public static void main(String[] args) {
           /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */

        String str = "he8llo 5world a1b2c3";

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int result = 0;
        int result2 = 0;

        for (char each : arr) {
            if (each >= 48 && each <= 57) { // 1 2 3 4 5 6 7 8 9
                result += Integer.parseInt("" + each);
            }
            if (Character.isDigit(each)){
                result2 += Integer.parseInt(""+each);
            }

        }
        System.out.println(result);
        System.out.println(result2);

        String str1="M6y 3nam32e i4s i9lk633ay23";
        char [] ch=str1.toCharArray();
        System.out.println(ch);
        System.out.println(Arrays.toString(ch));

        int sum1=0;
        int sum2=0;

        for( char each1: ch){
            if(each1>=48 && each1<=57){

            }

        }

    }
}