package day23;

public class RenestechStudent {


    //name   : unique           //instance method
    //number : unique          //instance method
    //school name :Renastech  // static method better static variable

    //since school name not going to chance always it will be better if I assign static method
    //and assigned one time at the beginning


    //instance method create
    String name;
    int number;

    //static method create
    static String schoolName;

    //instead of hardcoding student number we will create a counter that will count students and assign
    static int countNumbers=0;

    public void setStudentInfo(String name){ //aydin //ramazan //mahir

        this.name=name;

        number=setStudentNumber();
    }
    // this method will increase student number and return an integer value as a unique number
    public static int setStudentNumber(){

        countNumbers++; // 1 2 3

        return countNumbers;
    }

    //static method for school name

    public static void setSchoolName(String sclname){
      //  this.schoolName=schoolName; we cant use this method here

        schoolName=sclname;

    }

    //get information instance method

    public void  getStudentInfo(){
        System.out.println("Name of Student :"+name);
        System.out.println("Student number :"+number);

        //accesing static variable
        System.out.println("School Name:"+schoolName);
    }

    //
    public String toString(){

        return "Name :"+name+", Student Number : "+number;
    }



}
