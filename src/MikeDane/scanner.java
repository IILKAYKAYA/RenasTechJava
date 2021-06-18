package MikeDane;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number ");
        int num=scan.nextInt();

        System.out.println("enter a operator");
        String op=scan.next();

        System.out.println("enter a second number ");
        int num2=scan.nextInt();

        if (op.equals("+")){
            System.out.println(num+num2);

        }else if(op.equals("-")){
            System.out.println(num-num2);

        }else if(op.equals("*")){
            System.out.println(num*num2);

        }else if(op.equals("/")){
            System.out.println(num/num2);

        }else if(op.equals("%")){
            System.out.println(num%num2);
        }

        else{
            System.out.println("Invalid operator");
        }
    }
}
