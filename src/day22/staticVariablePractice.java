package day22;
import MyLibrary.Library;

public class staticVariablePractice {

    //local variable : declerad inside of block inside main method
    //instance variable :declared outside of the blocks
    //instance variable can have multiple copy from object
    //they needs to be called through object
    //static variables :declared outside of any block with static keyword
    //static variable can only have one copy from object
    //they can also be called with classname itself

    int instanceVrb;
    static int staticVrb;

    public static void main(String[] args) {
        int localVrb;

        //instanceVrb   needs to be called through object
        staticVariablePractice objc1=new staticVariablePractice();
        objc1.instanceVrb=20;
        objc1.staticVrb=10;

        staticVariablePractice obj2=new staticVariablePractice();

        ////instance variable can have multiple copy from object
        System.out.println(objc1.instanceVrb);//20
        System.out.println(obj2.instanceVrb);//0

        Library.stars();

        // //static variable can only have one copy from object
        System.out.println(objc1.staticVrb);//10
        System.out.println(obj2.staticVrb);//10


        ////they can also be called with classname itself
        System.out.println(staticVariablePractice.staticVrb);

        //instance variable
        //they needs to be called through object
        //System.out.println(staticVariablePractice.instanceVrb);




    }


}
