package Assignmentsfromteacher;

public class May16 {

    public static void main(String[] args) {

        //  check if 350 is divisible by 2 , 3 , 5  (Check for each number)
        //  if it is divisible print : 350  is divisible by 2 true
        //  if it is not divisible print : 350 is divisible by 2 false


        int num = 350;
        int result = (2 * 3 * 5);

        boolean bull = true;
        boolean bull2 = false;

        if (num % result == 0) {
            System.out.println(num + " is divisible by 2, 3 and 5");

        } else if (num % 2 == 0 ) {
            System.out.println(num+ " is divisible by 2 true" );

        } else if (num % 3 == 0) {
            System.out.println(num + "is divisible by 3");

        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");

        } else {
            System.out.println();
        }
    }

}
