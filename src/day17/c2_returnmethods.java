package day17;

public class c2_returnmethods {

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter


// return method (without parameters)
    // return method (with parameters)

    public static void minNum(int i1,int i2){
        if (i1<i2){
            System.out.println("small number is "+i1);
        }else {
            System.out.println("small number is "+ i2);
        }

    }
    //void measn any data type
    // you dont need to use rerutn stament

    public static int minNum2(int i1,int i2){
        if (i1<i2){
            System.out.println("small number is "+i1);
            return i1;
        }

        return i2;
    }

    public static void main(String[] args) {
        minNum(20,30);//20

        int min=minNum2(20,30);
        System.out.println(min+5); //25

        int result=division(20,2);
        System.out.println(result);

        int result2=division(100,25);
        System.out.println(result2); //4
        result2 = result2 + 10; //14
        System.out.println(result2);


//        int result3=minNum(8,9);  this method return type is void not int
        //you cant store in int



        addition(10,65);
        int result3=addition2(5,5);
        System.out.println(result3);

        byte b1=5;
        byte b2=5;
        int result4=addition3(b1,b2);

    }



    public static int division(int i1 , int i2){
        //return type is int
        //at the end you need to retun int from this method
        System.out.println("hello this is division method");
        System.out.println("division of : "+ i1 +"," +i2);


        //return "nhfgbnv";
        // you always will need to have return statement
        // that will return your result depenndss on yoyr method retunr type
        return i1/i2;
    }

    //create a return method that will print addition of 2 number
    //number1 + number2

    public  static void addition(int number1 , int number2){
        System.out.println(number1+number2);
    }

    public static int addition2(int number1 , int number2){

        return number1+number2;
    }

    public static int addition3(byte number1 , byte number2){

        return number1+number2;
    }
}