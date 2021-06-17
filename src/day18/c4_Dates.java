package day18;

import java.time.LocalDate;

public class c4_Dates {

    public static void main(String[] args) {

        //LocalDate class coming from library import java.time.LocalDate;

        LocalDate localDate=LocalDate.of(2021,06,16);

        System.out.println(localDate);

        LocalDate localDate2=LocalDate.of(2015,07,26);
        System.out.println(localDate2);

        //is after , is before
        boolean bool1=localDate.isAfter(localDate2);
        boolean bool2=localDate.isBefore(localDate2);
        boolean bool3=localDate.isEqual(localDate2);

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        LocalDate todayDate=LocalDate.now();
        System.out.println("today is : " +todayDate);

        String str1=localDate.toString(); // 2021-06-16
        str1 = str1.replace("-", ".");
        System.out.println(str1);
    }
}
