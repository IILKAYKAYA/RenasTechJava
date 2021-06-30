package day24;

public class AccessModifiersTest {

    public static void main(String[] args) {
        AccessModifers obj=new AccessModifers();

        System.out.println(obj.publicVarible);//30
        System.out.println(obj.defaultVrble);//20
        //System.out.println(obj.privateVariable); private will be only accesible from same class
    }
}
