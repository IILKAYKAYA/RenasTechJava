package day17;

public class c1_practice {

    public static void main(String[] args) {
        calculate(10,20,'*');

        int i=100;
        int i2=20;
        char ch='/';

        calculate(i,i2,ch);
        calculate(120,2,'%');
        calculate(25,5,'-');
        calculate(20,30,'*');



        // write a method that will take 3 parameters
        //2 numbers and one operator
        //it will do the calculation

        //ex : 20 10
        //result 2

        //ex : 30 3 *
        //result :90

        }
    public static void calculate(double number1, double number2, char operator){

        // + - * / %
        // invalid operator
        switch(operator){
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '/':
                System.out.println(number1/number2);
                break;
            case'*':
                System.out.println(number1*number2);
                break;
            case '%':
                System.out.println(number1%number2);
                break;
            default:
                System.out.println("invalid number");
        }


    }
}
