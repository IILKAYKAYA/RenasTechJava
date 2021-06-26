package day23;
import MyLibrary.Library;

public class StudentObject {

    public static void main(String[] args) {
        //in static methods
        //to be able to call instance variable , instance method you would need to create an object

        //but for static members you dont need it

        //lets assign school name
        RenestechStudent.setSchoolName("RenasTech");


        RenestechStudent s1=new RenestechStudent();
        s1.setStudentInfo("Heshu");

        RenestechStudent s2=new RenestechStudent();
        s2.setStudentInfo("Serhat");

        s1.getStudentInfo();
        s2.getStudentInfo();

        RenestechStudent s3=new RenestechStudent();
        s3.setStudentInfo("Vahap");

        s3.getStudentInfo();


        Library.stars();
        System.out.println(s1);//to string
    }
}
