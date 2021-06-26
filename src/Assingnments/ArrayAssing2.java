package Assingnments;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayAssing2 {

    public static void main(String[] args) {

        //use bulk operations to add multiple data(10) to your arraylist
        //use containsAll method to check if they are contain those data that you passed
        //use retainAll to retain ony 5 data in your lists
        //use removeall method to remove 3 data in your list
        //while you working on this make sure to use print line each time so you can see what differences has been made to your lists


        //use bulk operations to add multiple data(10) to your arraylist

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(22,4,6,78,10,20,3,45,55,62));
        numbers.addAll(Arrays.asList(90,52));
        numbers.add(15);
        System.out.println(numbers); // [22, 4, 6, 78, 10, 20, 3, 45, 55, 62, 90, 52, 15]

        //if you sort it
        Collections.sort(numbers);
        System.out.println(numbers); //[3, 4, 6, 10, 15, 20, 22, 45, 52, 55, 62, 78, 90]

        //use containsAll method to check if they are contain those data that you passed

        //contains will check only one number
        System.out.println("Numbers contains(90) :" +numbers.contains(90)); //true
        System.out.println("Numbers contains(36) :" +numbers.contains(36)); //false

        // containsAll method check multiple numbers in the array
        boolean bool=numbers.containsAll(Arrays.asList(10, 20, 55, 15));
        System.out.println("Numbers contains all (10, 20, 55, 15 ): " +bool); //Numbers contains all (10, 20, 55, 15 ): true

        //use retainAll to retain ony 5 data in your lists
        ArrayList<Integer> numlist=new ArrayList<>();
        numlist.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,2,3,4,5));
        System.out.println("numlist numbers :" +numlist); //numlist numbers :[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 2, 3, 4, 5]

        numlist.retainAll(Arrays.asList(2,3,4,5,10));
        System.out.println("numlist after retainAll :" +numlist); //numlist after retainAll :[2, 3, 4, 5, 10, 10, 10, 2, 3, 4, 5]

        //use removeall method to remove 3 data in your list
        numlist.retainAll(Arrays.asList(2,3,4));
        System.out.println("Numlist after remove 3 data : "+numlist); //Numlist after remove 3 data : [2, 3, 4, 2, 3, 4]

















    }
}
