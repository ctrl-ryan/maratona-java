package exerciciosjava.AAintroducao;

public class ExercicioMatrizesMultidimensionais01 {
    public static void main(String[] args) {
        int[][] matriz = {


                {2,5,4,6,7},
                {3,5,6,2,5},            //coluna ↓ ↓ ↓ ↓
                {4,6,4,5,4}


                //linha → → → →

        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        }
    }

