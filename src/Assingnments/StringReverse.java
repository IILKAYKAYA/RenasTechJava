package Assingnments;

public class StringReverse {

    //Write a return method that can reverse String
    // ABCD ----> DCBA

    public static void main(String[] args) {

        reverse("ABCD");

    }

    public static String reverse(String str) {

        String reverse = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
        return reverse;


    }


    }
