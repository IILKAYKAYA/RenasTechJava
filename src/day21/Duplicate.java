package day21;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicate {
    public static void main(String[] args) {

        //tekrarlayan
        // Write a java program that will return duplicates datas from an arraylist
        // list1 {1, 2, 3, 1, 4, 5, 6, 2, 7, 10}
        // output 1,2
        // input list2 {a,b,c,d,x,e,c,d,x,x}
        // c,d,x

        ArrayList<String> letters = new ArrayList<>();

        letters.addAll(Arrays.asList("a", "b", "c", "d", "c", "x", "x", "e", "x"));

        //at the end I want to return only duplicate values
        // my output should be c,x

        ArrayList<String> duplicateLetters = new ArrayList<>();

        // I will store duplicate values inside here

        //if count of letter more than 1 that means this is dubplicate value

        for (int i = 0; i < letters.size(); i++) { // "a","b","c","d","c","x","x","e","x"

            int count = 0;

            for (String each : letters) { // "a","b","c","d","c","x","x","e","x"
                if (each.equals(letters.get(i))) {
                    count++;
                }

            }
            if (count > 1 && !duplicateLetters.contains(letters.get(i))) {
                duplicateLetters.add(letters.get(i));
            }

        }
        System.out.println(duplicateLetters); // [c,x]

        System.out.println("_______________________________");


        //2. method easy

        //Collections frequency () which will give us count of data

        ArrayList<String> letters2=new ArrayList<>(); // I will store dublicates values inside here

        letters2.addAll(Arrays.asList("a","b","c","d","c","x","x","e","x"));


        ArrayList<String> dublicateLetters2=new ArrayList<>(); // i will store dublicate values inside here

        for (String each2 : letters2){

            int count2= Collections.frequency(letters2,each2);
            System.out.println(each2 +" count is " + count2);

            if (count2 >1 && !dublicateLetters2.contains(each2)){
                dublicateLetters2.add(each2);
                System.out.println(dublicateLetters2);
            }
        }

        System.out.println("final result");
        System.out.println(dublicateLetters2);

    }
}