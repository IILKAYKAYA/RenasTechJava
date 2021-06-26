package Assingnments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class duplicateexeday21 {

    public static void main(String[] args) {


        ArrayList<String> letter=new ArrayList<>();

        letter.addAll(Arrays.asList("a","b","c","d","e","f","f","c","a","j"));

        ArrayList<String> duplicate=new ArrayList<>();

        for(String each :letter){

            int count= Collections.frequency(letter,each);
            System.out.println(each+ " is " + count);

            if (count>1 && !duplicate.contains(each)){
                duplicate.add(each);
                System.out.println(duplicate);
            }
                }
            }
        }


