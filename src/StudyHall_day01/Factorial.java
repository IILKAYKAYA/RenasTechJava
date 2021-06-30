package StudyHall_day01;


public class Factorial {

//Write a return method that returns the factorial number of any given number
//         Ex:
//              Input: 4
//              output: 24

    public static int factorialNumbers(int n) {
        int result = 1;

        for(int i=1 ; i <=n ; i++){

            result = result * i;
        }
        return result;


    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorialNumbers(n));
    }
}
