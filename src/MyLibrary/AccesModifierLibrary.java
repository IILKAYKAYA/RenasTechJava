package MyLibrary;

import day24.AccessModifers;

public class AccesModifierLibrary {

    public static void main(String[] args) {
        AccessModifers obj1=new AccessModifers();

        System.out.println(obj1.publicVarible);//from everywhere
        // System.out.println(obj1.defaultVrble);//default needs be same package
        // System.out.println(obj1.privateVariable);//priavaete needs to be same class



    }}
