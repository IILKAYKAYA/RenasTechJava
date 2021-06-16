package day06;

public class c5_switchStatement {

    public static void main(String[]args){

    //without break statement
    char ch1='D';
    String result="Hello ";

    // 3 case which is A B C
        switch (ch1){ //C
        case 'A':
            result += "A"; // hello A
        case 'B' :
            result += "B"; //hello AB
            //break;// break stop switch
        case 'C' :
            result += "C";
        default: //when you dont have any match default will be run like else
            result += "invalid";
    }
        System.out.println(result);
}
}
