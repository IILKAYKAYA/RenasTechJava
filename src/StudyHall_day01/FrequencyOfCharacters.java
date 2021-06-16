package StudyHall_day01;

public class FrequencyOfCharacters {

    //Write a program that returns frequency of given characters.
    //ex:
    //input: “java”
    //output: “j1a2v1"
    //input: “goodday”
    //output: “g1o2d2a1y1"
    //2. Write a program that returns unique numbers in an array.
    //input : int[] arr = {1,1,1,2,3,2,3,4,5,4,4,6,7,8,9};
    //output : 5,6,7,8,9
    //3. Write a program that returns unique words in an array.

    //Write a program that returns frequency of given characters.
    //ex:
    //input: “java”
    //output: “j1a2v1"
    //input: “goodday”
    //output: “g1o2d2a1y1"

    public static void main(String[] args) {

        String str= "aaaabbbbbbcdeeef";
        String nonDup= ""; // a b c d e f

        for (int i =0; i<=str.length()-1; i++){

            String s=""+str.charAt(i);
            if(!nonDup.contains(s)){
                nonDup+=s;
            }
        }
      //  System.out.println(nonDup); // a b c d e f
        String result ="";

        for(int j=0; j<=nonDup.length()-1; j++){

            char ch=nonDup.charAt(j);

            int count = 0;
        }


    }
}
