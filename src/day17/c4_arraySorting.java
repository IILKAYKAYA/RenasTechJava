package day17;


import java.util.Arrays;

public class c4_arraySorting {

    public static void main(String[] args) {
        int [] numbers = {5, 10, 2, 20 };
        descandingArray(numbers);

        int [] result=descandingArray2(numbers);
        System.out.println(Arrays.toString(result));
        System.out.println(result[1]);

        int [] numbers2= {0,2 ,5 , 25 ,10 , -5};

        int [] result2=descandingArray2(numbers2);
        System.out.println(Arrays.toString(result2));
    }
    //print given array in descending order
    public static  void descandingArray(int [] arr ){  // 5 10 2 20
        Arrays.sort(arr); //2 5 10 20

        for (int i = arr.length -1 ; i>=0 ; i-- ){
            System.out.print(arr[i] + " "); //20 10 5 2
        }

        System.out.println();
    }

    //return method
    public static int[] descandingArray2(int [] arr){  //{5, 10, 2, 20 };       {0,2 ,5 , 25 ,10 , -5};
        Arrays.sort(arr);//{2, 5, 10, 20 };       {-5,0,2,5,10,25};

        int [] descArr=new int[arr.length];//{0, 0, 0, 0 };
        //20 10 5  2

        int lastIndex= arr.length -1; // 3

        for (int i =0 ; i < descArr.length ;i++){
            descArr[i] = arr[lastIndex];
            lastIndex--;
            //descArr[0] = arr[3];
            //descArr[1] = arr[2];
            //descArr[2] = arr[1];
            //descArr[3] = arr[0];


        }


        //my descending order array
        return descArr;

    }
}
