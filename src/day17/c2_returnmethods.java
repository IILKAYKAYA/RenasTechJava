package day17;

public class c2_returnmethods {

    public static void minNum(int i1, int i2) {

        if (i1 < i2) {
            System.out.println("small number is " + i1);
        } else {
            System.out.println("small number is " + i2);
        }
    }

    //void means int data type
    //you dont need use to use return statement

    public static void main(String[] args) {
        minNum(20, 30); //20

       // int min=minNum(20,30);
        //System.out.println(min+5);

        int result = division(20, 2);
        System.out.println(result);

        int result2=division(100,25);
        System.out.println(result2); //4
        result2=result + 10; // 4+10 = 14
        System.out.println(result2);


        addition(3,8);
        int result3=addition2(5,8);
        System.out.println(result3);

    }

    public static int division(int i1, int i2) {
        //return type is int
        //at the end you need to return int from this method
        System.out.println("hello this is division method");
        System.out.println("division of : "+i1+","+i2);

    return i1/i2;
    }


    //create a return method that will print addition of 2 number

    public static void  addition(int a,int b){
        System.out.println(a+b);

}
    public static int addition2(int a,int b){
       int result=a+b;
        return result;


    }
}
