package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
       int somar = 0;
       int[] numeros = {0,3,5,3,2,43,3};
       for (int num: numeros){
           somar = somar + num;
       }
        System.out.println(somar);
    }
}
