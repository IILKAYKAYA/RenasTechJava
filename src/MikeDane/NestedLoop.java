package MikeDane;

public class NestedLoop {

    public static void main(String[] args) {

        int [][] numberGrid= { {1,2,3}, {4,5,6}, {7,8,9}, {0} };
                             //   0        1        2      3
                             // 0 1 2    0 1 2    0 1 2    0
       // System.out.println(numberGrid[3][0]);



        for (int i = 0; i < numberGrid.length; i++){

            for (int j=0; j < numberGrid[i].length; j++){

                System.out.print(numberGrid[i][j]);

            }
            System.out.println();

        }

    }
}
