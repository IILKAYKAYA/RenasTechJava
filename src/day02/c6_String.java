package day02;

public class c6_String {

        public static void main(String [] args){
            String name="Ilkay";
            String companyName="Amazon";
            String companyName2="Renastech";
            double salary=110000.00;
            System.out.println("Name : " + name + " Company Name :" + companyName2 + " Salary : "+ salary);
            //printing them in new lines
            System.out.println("Name : " + name + "\nCompany Name :" + companyName2 + "\nSalary : "+ salary);
            // to make println concat different variables you need to use  +
            String number="100000"; // this is still word. it has multiple
            System.out.println(salary + 10 );//110010.00 both varible is number so it will sum both
            System.out.println(number + 10 );//100000+10  since you have string it is going to concat
            int i1=7; //number
            int i2=8; //number
            String s1="7"; // string word
            String s2="8"; // string  word
            System.out.println(i1+i2); // 7 + 8 ==15  both are number it si going to sum them
            System.out.println(s1+s2); // 7+8== 78   if we have string it is going  to concat them

            System.out.println(s1+i1); // 7(word)+7(number) = 77
            System.out.println(i1+10); //17
            System.out.println(s1+10); //710 this is still word character


            String name1="Irmak";
            String name2="Eymen";
            String name3="Esila";

            int a1=13;
            int a2=9;
            int a3=7;

            System.out.println(name1 + "age is :" + a1);
            System.out.println(name2 + "age is :4" + a2);
            System.out.println(name3 + "age is :" + a3);

            int sum=(a1+a2+a3);

            System.out.println("sum of persons age "+ sum);


        }}
