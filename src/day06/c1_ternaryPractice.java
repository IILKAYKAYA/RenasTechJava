package day06;

public class c1_ternaryPractice {

    //Task1 :create a java project that will check if number is even or odd
    //Task2 :create a java program that will check if number is divisible by 2 and 5 same time
    //please solve the task with if statement and ternary statement

    public static void main(String [] args ){
        //Task1 :create a java project that will check if number is even or odd
        int number ;
        number=25;
        String result="";
        //lets try with if statement
        if (number % 2 == 0){
            result = "Number is Even";
        }else {
            result = "Number is Odd";
        }
        System.out.println(result);


        //ternary practice
        //if ?
        //else :

        String result2= (number % 2 == 0) ? "Number is even" : "Number is Odd" ;

        System.out.println(result2);


        //Task2 :create a java program that will check if number is divisible by 2 and 5 same time
        int i1=10;//1
        int i2=15;
        //(i1*i2)  150
        boolean divisibleBy2and5 = ( (i1*i2) % 2 ==0 && (i1*i2) % 5 ==0) ? true : false;
        System.out.println((i1*i2)+" is divisible by 2 and 5 :" + divisibleBy2and5);

        //(Numbers) Divisible by 3, 5, 15
    //Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    //if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    //if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    //if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
    //ex:
    //OutPut:
    //Divisible By 15 15 30 45 60 75 90
    //Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    //Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99






    }

}
