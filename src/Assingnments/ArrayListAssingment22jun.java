package Assingnments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssingment22jun {

    //create 3 different arraylist : Double , Integer , String .
    //use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))
    //use remove method to remove 2 of them (use index number to remove or object name to remove)
    //print size of list
    //use indexof method to print last index of arraylists
    //use contains method to check if your arraylist are contain the data that you passed
    //use Collections.sort method to sort your arrray list and use get method to print them
    //use clear method to clear all your list
    //check if they are empty by isEmpty method
    //use bulk operations to add multiple data(10) to your arraylist
    //use containsAll method to check if they are contain those data that you passed
    //use retainAll to retain ony 5 data in your lists
    //use removeall method to remove 3 data in your list
    //while you working on this make sure to use print line each time so you can see what differences has been made to your lists
    public static void main(String[] args) {

        //create 3 different arraylist : Double , Integer , String .

        ArrayList<Double> dbl=new ArrayList<>();
        ArrayList<Integer> Int=new ArrayList<>();
        ArrayList<String> Str=new ArrayList<>();


        //use add method to add 5 data for each of arraylist(use add(data) also use add(index,data))

        dbl.add(2.4);
        dbl.add(3.5);
        dbl.add(6.8);
        dbl.add(2,3.9);
        dbl.add(0,7.9);
        System.out.println(dbl); //[7.9, 2.4, 3.5, 3.9, 6.8]

        Int.add(10);
        Int.add(20);
        Int.add(30);
        Int.add(0,40);
        Int.add(1,50);
        System.out.println(Int); //[40, 50, 10, 20, 30]

        Str.add("Karen");
        Str.add("Beren");
        Str.add("Helen");
        Str.add(0, "Sara");
        Str.add(2, "Maya");
        Str.add(4, "Lara");
        System.out.println(Str); //[Sara, Karen, Maya, Beren, Lara, Helen]

        //use remove method to remove 2 of them (use index number to remove or object name to remove)
        dbl.remove(2);
        dbl.remove(3);
        System.out.println(dbl); //[7.9, 2.4, 3.9]

        Int.remove(0);
        Int.remove(1);
        System.out.println(Int);   //[50, 20, 30]

        Str.remove(1);
        Str.remove(3);
        System.out.println(Str); // [Sara, Maya, Beren, Helen]


        //print size of list

        System.out.println("Double Array size is : "+dbl.size()); //Double Array size is : 3
        System.out.println("Integer Array size is : "+Int.size()); //Integer Array size is : 3
        System.out.println("String Array size is : "+Str.size()); //String Array size is : 4

        //use indexOf method to print last index of arraylists ********

       System.out.println(dbl.lastIndexOf(6)); // on the console -1


        //use contains method to check if your arraylist are contain the data that you passed

        System.out.println(dbl.contains(2.3));  //false
        System.out.println(Int.contains(50));   // true
        System.out.println(Str.contains("Beren")); //false

        //use Collections.sort method to sort your array list and use get method to print them

        Collections.sort(dbl);
        Collections.sort(Int);
        Collections.sort(Str);

        System.out.println("Double array after sort " +dbl); //Double array after sort [2.4, 3.9, 7.9]
        System.out.println("Integer array after sort " +Int); //Integer array after sort [20, 30, 50]
        System.out.println("Names array after sort " +Str);  //Names array after sort [Helen, Lara, Maya, Sara]

        //get method to print them
        for(int d=0; d<dbl.size(); d++){
            System.out.println("dbl.get("+d+")="+dbl.get(d));
            //dbl.get(0)=2.4
            //dbl.get(1)=3.9
            //dbl.get(2)=7.9
        }

        for(int i=0; i<Int.size(); i++){
            System.out.println("Int.get("+i+")="+Int.get(i));
            //Int.get(0)=20
            //Int.get(1)=30
            //Int.get(2)=50
        }

         for(int s=0; s<Str.size()-1 ; s++){

             System.out.println("Str.get("+s+")="+Str.get(s));
            // Str.get(0)=Beren
            // Str.get(1)=Helen
            // Str.get(2)=Maya
         }


        System.out.println("**************************************");
        //use clear method to clear all your list

         dbl.clear();
         System.out.println(dbl); //[]
         Int.clear();
         System.out.println(Int); //[]
         Str.clear();
         System.out.println(Str); //[]

        //check if they are empty by isEmpty method

        System.out.println("Before clear double array: "+dbl); //Before clear double array: [2.4, 3.9, 7.9]
        dbl.clear();
        System.out.println("After clear double array : "+dbl); //After clear double array : []
        boolean booldbl=dbl.isEmpty();
        System.out.println(booldbl); //true

        System.out.println("Before clear Integer array: "+Int); //Before clear Integer array: [20, 30, 50]
        boolean boolInt=Int.isEmpty();
        System.out.println(boolInt); //false
        Int.clear();
        System.out.println("After clear Integer array : "+Int); //After clear Integer array : []


        System.out.println("Before clear String array: "+Str); //Before clear String array: [Beren, Helen, Maya, Sara]
        boolean boolStr=Str.isEmpty();
        System.out.println(boolStr); //false
        Str.clear();
        System.out.println("After clear String array : "+Str); //After clear String array : []













    }

}
