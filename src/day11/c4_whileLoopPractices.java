package day11;

public class c4_whileLoopPractices {

    public static void main(String[] args) {

        // print below figure
        // *****
        // 5 times *

        int i=0;
        while(i < 5){ // 0 1 2 3 4

           System.out.println(i+ "    *     ");

            i++; // 0 1 2 3 4

          System.out.println(i+ " * "); //  1 2 3 4 5
        }


        // print below figure
        /*

        ****
        *  *
        *  *
        *  *
        *  *
        *  *
        *  *
        ****


         */

        System.out.println("---------------");
        System.out.println("****");

        int count=1;

        while(count < 7){

            count++;
            System.out.println("*  *");
        }
        System.out.println("****");



    }
}
