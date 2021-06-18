package MikeDane;

public class IfStatementsCount {

    public static void main(String[] args) {
        //max(6,9,15);
        System.out.println(max(30,558,306));
    }

    public static int max(int num1, int num2, int num3){

        if (num1 >= num2 && num1 >= num3){
            return num1;

        }else if(num2 >= num1 && num2 >= num3){
            return num2;

        }else{
            return num3;
        }
    }
}
