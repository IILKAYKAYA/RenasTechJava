package exercises;

public class assign01_may {

    public static void main(String[] args) {

        //   1. Please create a class call variable practice and make sure to create at least
        //   2 different example for each data type we learned (byte,int,short,long,double,float,boolean and char)

        //   2. Assignment create 3 number and use arithmetic operators (+ - * / %)
        //   use each operator at least 2 times for your numbers

        //   3. check if 350 is divisible by 2 , 3 , 5  (Check for each number)
        //          if it is divisible print : 350  is divisible by 2 true
        //          if it is not divisible print : 350 is divisible by 2 false




        //   1. Please create a class call variable practice and make sure to create at least
        //   2 different example for each data type we learned (byte,int,short,long,double,float,boolean and char)

        byte a =1;
        short  s =90;
        int i = 48575849;
        long l= 47896514;
        double d=1.5;
        float f=77;

        char ch='a';


        //   2. Assignment create 3 number and use arithmetic operators (+ - * / %)
        //   use each operator at least 2 times for your numbers

        int number1 = 1892;
        int number2 = 939;
        int number3 = 87;

        int sum;
        sum = number1 + number2 +number3;

        System.out.println("Sum of the 3 numbers : " + sum);

        int minus;
        minus = number1-number2-number3;

        System.out.println("minus of the 3 numbers : "+ minus);

        int multiple;
        multiple = number1*number2*number3;

        System.out.println("multiple of the 3 numbers :"+multiple);

        int divisible;
        divisible = number1/number2/number3;

        System.out.println("divisible of the 3 numbers : " +divisible);

        //   3. check if 350 is divisible by 2 , 3 , 5  (Check for each number)
        //          if it is divisible print : 350  is divisible by 2 true
        //          if it is not divisible print : 350 is divisible by 2 false

        int num=350;

        if (num%2==0) {
            System.out.println("350 is divisible by 2 is true");
        }else {
            System.out.println("350 is not divisible by 2 false");
        }
        if (num%3==0){
            System.out.println("350 is divisible by 3 is true");
        } else{
            System.out.println("350 is not divisible by 3 false");
        }
        if (num%5==0){
            System.out.println("350 is divisible by 5 is true");
        }else{
            System.out.println("350 is not divisible by 5 false");
        }


    }
}
