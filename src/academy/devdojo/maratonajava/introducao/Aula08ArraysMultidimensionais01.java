package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] exemplo = new int[3][3];
        exemplo[0][0] = 10;
        exemplo[0][1] = 20;
        exemplo[0][2] = 30;

        exemplo[1][0] = 100;
        exemplo[1][1] = 200;
        exemplo[1][2] = 300;

        exemplo[2][0] = 1000;
        exemplo[2][1] = 2000;
        exemplo[2][2] = 3000;

//        System.out.println(exemplo[0][0]);
//        System.out.println(exemplo[0][1]);
//        System.out.println(exemplo[0][2]);
//
//        System.out.println(exemplo[1][0]);
//        System.out.println(exemplo[1][1]);
//        System.out.println(exemplo[1][2]);
//
//        System.out.println(exemplo[2][0]);
//        System.out.println(exemplo[2][1]);
//        System.out.println(exemplo[2][2]);

        for (int i = 0; i < exemplo.length; i++) {
            for (int j = 0; j < exemplo[i].length; j++) {
                System.out.println(exemplo[i][j]);
            }
        }
    }
}
