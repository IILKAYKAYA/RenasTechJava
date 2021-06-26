package StudyHall_day01;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        // Write a program that can combine two arrays.

        char [] ch1={'A', 'B', 'C', 'D'};
        char [] ch2={'E', 'F', 'G', 'H'};

        char [] ch3=new char[ch1.length+ch2.length];

        int index = 0;

        for(char each : ch1){
            ch3[index]=each;
                    index++;
        }
        for(char each : ch2){
            ch3[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(ch3));
    }
}
