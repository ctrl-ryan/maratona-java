package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[]args){
        // idade < 15 infantil
        // idade >= 15 && idade < 18 juvenil
        //idade > 18 adulto


        int idade = 116;
//        String categoria;
//        if (idade < 13) {
//            categoria = "infantil";
//        } else if (idade >= 13 && idade < 18) {
//            categoria = "juvenil";
//        }else{
//            categoria = "adulto";
//        }
//        System.out.println(categoria);

        String categoria = idade < 13 ? "categoria infantil" : idade > 14 && idade < 18 ? "juvenil" : "adulto";
        System.out.println(categoria);

    }
}
