package day13;

public class c3_ArrayExamples {


    public static void main(String[] args) {


        // create a condition that will check list of array and it will print even numbers from the list

        // int [] numbers={-2,-5, 45 , 50 ,60,100,4 }
        //output should be -2 50,60,100,4

        int [] numbers={-2,-5, 45 , 50 ,60,100,4 };
        //loop
        //starting point first index of array
        //ending point last index of array
        //iteration

        for (int i=0; i <= numbers.length -1 ; i++){

            if (numbers[i] % 2==0){
                System.out.print(numbers[i]+ " ");  //-2 50
            }

        }


        System.out.println();


        //create a condition that will print min and max number from given array

        int [] listOfNumber={10,0,100,-50,25,47,200,999};

        //max 999
        //min -50
        //to have references
        int max= listOfNumber[0]; //just assume this is max //10
        int min= listOfNumber[0]; //just assume this is min //10

        //then we will compare each element with max min variables and then reassign

        //listOfNumber.length 8
        //last index will be 7
        //i < 8 =listOfNumber.length
        //i <= 7 listOfNumber.length -1
        for (int i=0; i < listOfNumber.length ; i++){// list0 =10 0 100 -50 .999

            if (listOfNumber[i] >= max){ //0 >=10  //100 >=10 // -50>=10
                max = listOfNumber[i]; //this will reassign max number with listofnumbers i //10 //100 // 100 .. 999
            }

            if (listOfNumber[i] <= min){ //0 <= 10  //100 <=0  // -50 <=0
                min = listOfNumber[i]; //0 //0 -50 ..
            }

        }

        System.out.println("Max is "+max);
        System.out.println("Min is "+min);




    }
}
