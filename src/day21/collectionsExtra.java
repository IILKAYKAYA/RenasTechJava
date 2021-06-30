package day21;


//import liner.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionsExtra {
    //All of those collections method will work any arraylistType String,Double,Integer ,Boolean ....
    // Collections Class:
    //
    //        sort(CollectionType): this will sort any given collectionType
    //
    //        frequency(CollectionType, Object): this will return the frequency of the given object
    //        from the given collectionType

    /// *****no exe frequency here it is inside duplicate class.
    //
    //        max(CollectionType): this will return the biggest object from collectionType
    //
    //        min(CollectionType): this will return the smallest object from collectionType
    //
    //        swap(CollectionType, index1, index3): this will swap the index1 and index 3
    //
    //        replaceAll(CollectionType, oldData, newData):



    public static void main(String[] args) {

        //my exe min max numbers for ArrayList

        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,3,3,4,4,10,-50,-35,80));

        System.out.println(Collections.max(num)); // short way

        int maxnum=Collections.max(num);
        int minnum=Collections.min(num);

        System.out.println(maxnum);
        System.out.println(minnum);

      //  line.stars();

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,4,5,6,7,100,-25,-55,-75,189));

        // max(CollectionType): this will return the biggest object from collectiontype
        // min(CollectionType): this will return the smallest object from collectiontype

        int maxNumber= Collections.max(numbers);
        int minNumber= Collections.min(numbers);

        System.out.println(maxNumber);
        System.out.println(minNumber);

        Integer maxNumberfromlist=189;
        numbers.remove(maxNumberfromlist);

        maxNumber=Collections.max(numbers);
        System.out.println(maxNumber); // second max number


        ArrayList<Integer> numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(100,25,35,55));
        System.out.println(numbers2);


        //swap(CollectionType, index1, index3): this will swap the index1 and index 3

        Collections.swap(numbers2,0,3);
        System.out.println("After swap" +numbers2);

        ArrayList<Double> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(2.5,5.5,10.5,5.5,5.5,2.5,11.5,25.3));

        System.out.println(numbers3);


        // replaceAll(CollectionType, oldData, newData):

        Collections.replaceAll(numbers3,5.5 , 5.245670);
        System.out.println(numbers3);

    }
}
