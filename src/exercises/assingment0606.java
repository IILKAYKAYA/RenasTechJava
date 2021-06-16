package exercises;

public class assingment0606 {

    public static void main(String[] args) {

        //Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
//Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
//Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.
//Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.
//Question 5
//
//Write a Java program to reverse the element of an integer  array.
//Question 6
//
//Write a Java program to find the largest and smallest element of an array.
//      // create a logic that will store 5 employees salaries (double) from scanner input
//    and print each salaries
//Output :
//
//Enter the salaries of 5 employees.
//234
//789
//123
//456
//453
//The salaries are:
//234.0
//789.0
//123.0
//456.0
//453.0


        //Question 1

        //Write Java statements that do the following:
        //a) Declare an array numArray of 15 elements of type int.
        //b) Output the value of the tenth element of the array alpha.
        //c) Set the value of the fifth element of the array alpha to 35.
        //d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.

        //a)
         int [] numArray={28, 3 , -8 , 35 , -52, 23 , 61, -10, 65, 56, 210, -320,410,  35, 43};
         //index       //  0  1   2    3     4    5    6    7   8   9   10   11   12   13  14

        //b)
        System.out.println(numArray[9]); //tenth element

        //c)
        System.out.println(numArray[4]=35);

        //d)
        System.out.println(numArray[8]=numArray[5]+numArray[12]);


        //Question 2

        //a) Write a statement that declares a string array initialized with the following strings:
        //"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
        //b) Write a loop that displays the contents of each element in the array that you declared.


        String [] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"} ;



        for (int i=1; i<=7 ; i++){

       //   for(  days=1; days<=i ; days++ );


        }
        System.out.println("days of the week : " +days);

    }
}


