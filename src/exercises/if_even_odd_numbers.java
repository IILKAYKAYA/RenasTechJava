package exercises;

public class if_even_odd_numbers {

    public static void main(String[] args) {

        int x=150;
        int y= 128;
        int max;
        if(x>y){
            max=x;
            System.out.println("maximum number beetween "  + x + " and "+y+ " " +max);
        }else if(y>x){
            max=y;
            System.out.println("maximim number between x and y : " +max);
        }

        int max2;
        max2 =(x>y)? x: y  ;
        System.out.println(max2);



        String result="";
        result=(false)? "JAVA" : "phyton";
        System.out.println(result);




        int number1 =133;
        int number2 = 133;
        int a=25;
        byte b=25;

        if (a==b){
            System.out.println(a+ " is equal to "+b);
        }else {
            System.out.println(a+ " is not equal to "+b );
        }

        if(number1 % 2 ==0){
            System.out.println(number1+" is even number");
        }else if(number1 %2 != 0){
            System.out.println(number1+ " is odd number");

        }else{
            System.out.println("invalid number");
        }
    }
}
