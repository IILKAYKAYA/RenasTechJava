package day20;

import java.util.ArrayList;

public class c2_ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();///0  empty list

        ArrayList<String> sentence=new ArrayList<>();

        ArrayList<Double> doubl=new ArrayList<>();

        doubl.add(23.45);
        doubl.add(0.12);
        doubl.add(3.25);
        doubl.add(63.23);
        doubl.add(5.32);
        System.out.println(doubl);

        doubl.set(3,6.3);
        System.out.println(doubl);
        doubl.remove(1);
        System.out.println(doubl);
        doubl.clear();
        System.out.println(doubl);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        sentence.add("ilkay");
        sentence.add("Beren");
        sentence.add("Mustafa");
        System.out.println(sentence);
        sentence.add(2,"huseyin");

        System.out.println(sentence);
        sentence.set(2,"Eymen");
        System.out.println(sentence);

        sentence.remove(0);
        System.out.println(sentence);

        //add(5) this will add the number to last index
        numbers.add(10);//index 0 == 10
        numbers.add(20); //index 1 == 20
        numbers.add(100); //index 2 == 100

        System.out.println(numbers);//[10, 20, 100]

        numbers.add(0,200); //[200, 10, 20, 100]
        //index      0     1   2   3
        System.out.println(numbers);

        numbers.add(2,25);//[200, 10, 25 ,20 ,100]  index 4 size 5
        System.out.println(numbers);

        //add(index,number)
        //this will add the number to given index number

        numbers.add(5,35); //index 5 size 6
        System.out.println(numbers); //[200, 10, 25, 20, 100, 35]

        //numbers.add(7,35);//IndexOutOfBoundsException   // index 7 size 8


        //set()  this method will set the value for given index it will be change to past a new one
        numbers.set(2,150);
        System.out.println(numbers);


        ArrayList<String> letters=new ArrayList<>();
        letters.add("B");
        letters.add("C");
        letters.add("E");
        letters.add("D");
        System.out.println(letters);

        letters.add(0,"A");
        System.out.println(letters);

        letters.set(4,"X");
        System.out.println(letters);

        //Remove
        letters.remove("B");

        System.out.println(letters);//[A, C, E, X]
        letters.remove("Y");
        //remove method will look at given object and if it is present in the list it will remove it
        //if it is not present nothing will change.
        System.out.println(letters);

        boolean bool1 = letters.remove("R"); // false
        boolean bool2 = letters.remove("C"); //true

        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println(letters);//[A, E, X]


        //clear method will clear everything in your list
        letters.clear();//[]


        System.out.println(letters); //[]

        //size
        System.out.println("letters.size() = " + letters.size());
        System.out.println("Sentence size is = " +sentence.size());


    }
}