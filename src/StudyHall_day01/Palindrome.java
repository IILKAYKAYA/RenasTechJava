package StudyHall_day01;

public class Palindrome {


        /*Write a return method that can reverse a String and checks if the String is palindrome or not.

*/
    // kayak   // level // madam

    public static String reversedStr(String str) {

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(reversedStr(str));
}

    public static void main(String[] args) {

        //1.way

      String str="Kayak";
        System.out.println(str.equalsIgnoreCase(reversedStr(str)));

        //2.way

        System.out.println(isPalindrome("level"));


        //3.way
        boolean result = isPalindrome("ilkay");
        System.out.println(result);

    }

}
