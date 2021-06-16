package day06;

public class c4_nestedIfPractice {
    public static void main(String [] args) {
        //create a java program to check if person is eligible to give blood
        //requirement to give blood :
        //person needs to be older then 18
        //person weight needs to be more then 50
        //expected output :
        // if person age is smaller and equal to 18
        //print :"Person needs to be older then 18 "
        //if person is eleigable
        //"Person is eligible to give blood"
        //if person is not
        //"Person is not eligible to give blood "
        //example test data is ramazan age is 15 weigth is 150
        //"Person needs to be older then 18 "
        //example test data is ramazan age is 20 weigth is 40
        //"Person is not eligible to give blood "
        //example test data is ramazan age is 20 weigth is 100
        ////"Person is eligible to give blood"
        //example test data is ramazan age is 18 weigth is 55
        //"Person needs to be older then 18 "
        String personName="Mahir";
        int age=75;
        double weight= 50;
        String result="";
        if ( age > 18 ){
            if (weight > 50.0){
                result= personName + " is eligible to give blood";
            }else if (weight <= 50.0 ){
                result= personName + " is not eligible to give blood ";
            }
        }else{
            result = personName + " needs to be older then 18 ";
        }
        System.out.println(result);


    }
    
}
