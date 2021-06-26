package day19;

public class c5_ValueOfMethods {

    public static void main(String[] args) {


    String str2="25";

    int number3 = Integer.parseInt(str2);

    Integer number5=Integer.valueOf(str2);

        System.out.println(25+number3+str2);
        System.out.println(number5+25);

        // valueOf methods: converting string to wrapper class value, returns wrapper class values


            String str="25";

            int number=Integer.parseInt(str);
            Integer number2=Integer.valueOf(str);

            System.out.println(str + 25); // 2525 String text
            System.out.println(number2 + 25); //50 Integar number

            String str1="55.5";
            Double d1=Double.valueOf(str1);
            System.out.println(d1 + 5 ); //60.5

            double d2=Double.valueOf(str1); // unboxing
            //Double.valueOf(str2) this returns wrapper class
            //we also took this wrapper class and assign to primitive which is unboxing


            String str3="TruE";
            Boolean bool= Boolean.valueOf(str3);

            //Boolean bool2 = str3;
            Boolean bool3 = 10>5;


            System.out.println(bool); // true
}
}