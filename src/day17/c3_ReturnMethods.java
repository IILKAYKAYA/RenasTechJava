package day17;

public class c3_ReturnMethods {

    public static void main(String[] args) {
        String firstName= "rustem";
        String lastName="erdem";

        System.out.println(concatNames(firstName,lastName));
        String newName= concatNames(firstName,lastName);
        System.out.println(newName.charAt(2));


        System.out.println(equalNames(firstName,lastName));

        System.out.println(equalNames(firstName,"rustem"));


        System.out.println(concatNames2(20,30));//2030
    }

    //first concat 2 string and then print me 3 letter from that string

    //create a return method that will concat 2 different string

    public static String concatNames(String name1 , String name2){

        return name1.concat(name2);
    }

    public static String concatNames2(int number , int number2){

        return ""+number+number2;
    }


    //create a logic that will check given names are equal
    public static boolean equalNames(String name1 , String name2){


        //return type needs to be booleen since method return type is boolean
        //return true;
        return  name1.equals(name2);

        //System.out.println(); error


    }
}
