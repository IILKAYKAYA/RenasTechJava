package Assingnments;

import java.sql.SQLOutput;

public class SDETObject {
    public static void main(String[] args) {

        SDET sdet=new SDET();

        System.out.println(sdet.name);
        System.out.println(sdet.Id);
        System.out.println(sdet.salary);
        System.out.println(sdet.companyName);


        sdet.name="ilkay";
        sdet.Id=123456789;
        sdet.salary=12.000;
        sdet.companyName="Apple";

    }
}
