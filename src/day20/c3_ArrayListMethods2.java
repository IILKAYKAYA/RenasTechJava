package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class c3_ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(); //empty integer Arraylist

        list.add(26);  //index 0
        list.add(35);  //index 1
        list.add(-55); // index 2
        list.add(-1);  // index 3


        //indexOf()
        // will print us index of the object you are passing
        //if the object is present in the list you will see index of that object
        //if the object is not present in your list you will see index number always as -1


        System.out.println(list.indexOf(26));  // 0
        System.out.println(list.indexOf(35));  // 1
        System.out.println(list.indexOf(-55)); // 2

        System.out.println(100); // -1 since I don't have 100 in my list it will return index


        int indexnum=list.indexOf(-55);  //2
        System.out.println(indexnum);

        System.out.println(list.indexOf(200)); // -1

        System.out.println(list.indexOf(-1));

        System.out.println("++++++++++++++++++++++++++++++++++++");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A"); // index 0
        list2.add("B"); // index 1

        System.out.println(list2.indexOf("B")); //index 1
        System.out.println(list2.indexOf("C")); // -1



        // contains return boolean condition

        System.out.println(list2.contains("A")); // true


        // all the methods that you use for arraylist will return you wrapper class
        //you can store them in wrapper class
        //but also you can store them with primitive data type

        boolean bool2=list2.contains("R");

        //list2.contains("R"); wrapper class unboxing

        System.out.println("bool2 = " + bool2);  // false

        //sort that comes from import java.util.Collections; library
        System.out.println("list = "+ list);

        //below method will ask for list and will sorted.
        Collections.sort(list);  // ascending order

        System.out.println("sorted list = " +list2); // sorted list2 = [A, B]

        Integer  num1= 10;
        Integer num2=20;
        System.out.println(num1+num2);


        //equals method

        ArrayList<Integer> numlist1=new ArrayList<>();

        numlist1.add(10);
        numlist1.add(20);

        ArrayList<Integer> numlist2=new ArrayList<>();
        numlist2.add(10);
        numlist2.add(20);
        numlist2.add(25);
        numlist2.add(4);

        System.out.println(numlist2); //[10, 20, 25, 4]

        Boolean bool1=numlist1.equals((numlist2));

        System.out.println(bool1); //false

        //get method
        Collections.sort(numlist2); // [4, 10, 20, 25] // sort is make a smaller to bigger

        System.out.println(numlist2);

        for (int i=0; i< numlist2.size(); i++){
            System.out.println("numberlist2.get("+i+")="+numlist2.get(i));

        }

        //is empty

        System.out.println("Before clear numlist2= " +numlist2);
        System.out.println("Before clear numlist2.size() = " +numlist2.size()); //4

        boolean bool3=numlist2.isEmpty();
        System.out.println("bool3 = " + bool3);

        numlist2.clear(); // that will remove all data fromlist

        System.out.println("After clear numlist2= " +numlist2);
        System.out.println("After clear numlist2,size() = " +numlist2.size()); //0

       //soutv this will create print line with variable information

        System.out.println(numlist2.isEmpty());
        System.out.println("After clear numlist2.isEmpty()= " + numlist2.isEmpty()); //true


    }
}
