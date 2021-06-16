package exercises;

public class stringmethods {

    public static void main(String[] args) {


        String str="hello";
        char  ch1=str.charAt(1);
        System.out.println(ch1);
        System.out.println(str.charAt(4));

        String a="Mustafa";
        char c=a.charAt(3);
        System.out.println(c);

        String b="nananananananananananana";
        char v=b.charAt(9);
        System.out.println(v);

        String h="Huseyin";
        char j=h.charAt(4);
        System.out.println(j);

        String i="ilkay";
        String s="kaya";
        int score1=90;
        String y=i.concat(s);
        System.out.println(y);
        System.out.println(i+s);
        System.out.println(i.concat(" "+s).concat(" "+score1));

        String myStr="Beren";
        String myStr2="Kaya";
        int score=90;
        System.out.println("*****************************************");
        System.out.println(myStr.concat(" " + myStr2));
        System.out.println(myStr.concat(" ").concat(myStr2));
        System.out.println(myStr.concat(" ").concat(myStr2).concat(" her score is: ").concat(""+score));



        String ttt="kjhhyghb ji887578";
        System.out.println(ttt.contains("7"));
        System.out.println(ttt.contains("p"));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        String ss1="Java  n  Ja5435";
        System.out.println(ss1.contains("j"));  //small case j which we dont have inside ss1 false
        System.out.println(ss1.contains("a")); //true
        System.out.println(ss1.contains("Ja")); //true
        System.out.println(ss1.contains("Ja "));//no space inside of ss1 it will false
        System.out.println("***************");
        System.out.println(ss1.contains("J"));  //true
        System.out.println(ss1.contains("va")); //true
        System.out.println(ss1.contains("Jv")); //Jv will be new string and we dont se Jv together inside ss1 false
        boolean example=ss1.contains(" ");
        System.out.println(example);
        System.out.println("____________________________");


        String ss2="Java 23 Hello";
        System.out.println(ss2.endsWith("Java")); // at the end we dont have Java False
        System.out.println(ss2.endsWith("o"));
        System.out.println(ss2.endsWith("lo"));
        System.out.println(ss2.endsWith("hello")); // samll h will be false
        System.out.println(ss2.endsWith("23 Hello"));
        System.out.println(ss2.endsWith("Java 23 Hello"));






    }



}
