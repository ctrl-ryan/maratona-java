package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {

        //forma direta
        int[][] array1 = {{1, 2, 3, 4}, {5, 6}, {7}, {8, 9}};

        //forma direta
        int[][] array2 = {
                {1, 2, 3, 4},
                {5, 6},
                {7},
                {8, 9}
        };

        //forma com operador "new"
        int[][] array3 = new int[4][];
        array3[0] = new int[]{1, 2, 3, 4};
        array3[1] = new int[]{5, 6};
        array3[2] = new int[]{7};
        array3[3] = new int[]{8, 9};


        //forma com "new", porem declarando uma por uma xD

        int[][] array4 = new int[4][];
        array4[0] = new int[4];
        array4[0][0] = 1;
        array4[0][1] = 2;
        array4[0][2] = 3;
        array4[0][3] = 4;
        array4[1] = new int[2];
        array4[1][0] = 5;
        array4[1][1] = 6;
        array4[2] = new int[1];
        array4[2][0] = 7;
        array4[3] = new int[2];
        array4[3][0] = 8;
        array4[3][1] = 9;

        for(int [] arrayBase: array1){
            for(int num: arrayBase){
                System.out.print(num);
            }
        }

        System.out.print("||||");

        for(int [] arrayBase: array2){
            for(int num: arrayBase){
                System.out.print(num);
            }
        }

        System.out.print("||||");

        for(int [] arrayBase: array3){
            for(int num: arrayBase){
                System.out.print(num);
            }
        }

        System.out.print("||||");

        for(int [] arrayBase: array4){
            for(int num: arrayBase){
                System.out.print(num);
            }
        }

    }
}
