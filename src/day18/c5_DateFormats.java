package day18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c5_DateFormats {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate); //2021-06-16

        System.out.println(localDate.format(dateTimeFormatter)); // 16/Jun/2021

        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("E MMMM/dd/yy");

        LocalDate localDate2=LocalDate.of(1984,02,20);

        System.out.println(localDate2.format(dateTimeFormatter1));

        // E :    day of name
        // MMM :  Jan
        // MMMM : January
        // yy :   84
        // yyyy : 1984

        LocalDateTime localDateTime=LocalDateTime.of(2018, 9, 30, 15, 48);
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");

        String str2=localDateTime.format(dateTimeFormatter3);
        System.out.println(str2);



    }

}
