package exercises;

public class ifNaveen {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if(b>a){
            System.out.println("b is grater than a");
        }else{
            System.out.println("a is grater than b");
        }

        int c = 40;
        int d= 40;

        if (c != d) {
            System.out.println("c equal d");
        }else{
            System.out.println("c and d not equal");
        }

        // write a logic to find out the highest number

        int a1 = 100;
        int b1 = 500;
        int c1 = 300;

        if(a1>b1 && a1>c1){
            System.out.println(a1+ " is the highest number");

        }else if(b1>a1 && b1>c1){
            System.out.println(b1+ " is the highest number");
        }else{
            System.out.println(c1+" is the highest number" );
        }



    }
}
