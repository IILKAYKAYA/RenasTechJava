package day11;

public class c1_breakStatement {

    public static void main(String[] args) {

        for (int i= 1 ; i<= 10 ; i++){
            // 1 2 3 ... 10 ---> ten time
             System.out.println("Java");


            // 4 only one time
            if(i==4){
                System.out.println("Java 2"); // 1 times
            }
        }


        // anytime java will reach to break break will stop current condition that you have.
        // if java catch break inside of loop
        //loop will be stopped running
        //anything after break statement wont be run

        for (int i = 1 ; i <= 10 ; i++){

            System.out.println("Hello"); // 1 time Hello

            if (i==4){
                System.out.println("Stop Hello");
                break;// break will stop for loop to running from after here
             //  System.out.println("Hello again"); //you cant print after break you cant sout here

            }

            System.out.println("Hello again"); // 1 2 3
        }


    }


}
