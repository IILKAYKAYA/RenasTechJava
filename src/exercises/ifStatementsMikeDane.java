package exercises;

public class ifStatementsMikeDane {
    public static void main(String[] args) {

        boolean isMale =false;
        boolean isTall= true;

        if(isMale && isTall){
            System.out.println("yo are a tall male");

        }else if (isMale && !isTall){

            System.out.println("you are short male");

        } else if (!isMale && isTall) {
            System.out.println("you are not male but tall");
        } else {
            System.out.println("you are either not male, or not tall");


        }
    }
}
