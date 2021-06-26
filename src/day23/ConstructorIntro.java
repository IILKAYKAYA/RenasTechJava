package day23;

public class ConstructorIntro {

    //constructor needs to have same name that class  has

//    public ConstructorIntro(){
//        //this will be created automatically if you dont create
//        //constructor helps class to create an object
//        System.out.println("default constrctor");
//    }

    //can we overloadd constroctor methods
    //yes

    public ConstructorIntro(int a){
        System.out.println("constructorr with arguments of int " + a);
    }

    public static void main(String[] args) {
        //ConstructorIntro obj1=new ConstructorIntro();
        // objects needs to be created with existing Constructor method

        ConstructorIntro obj2=new ConstructorIntro(10);
    }
}
