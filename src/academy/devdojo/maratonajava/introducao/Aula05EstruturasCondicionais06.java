package academy.devdojo.maratonajava.introducao;

import java.security.PublicKey;

public class Aula05EstruturasCondicionais06 {
    public static void main (String[]args){
        //verificar se é feriado ou dia útil, considerando domingo o numero 1
        byte dia = 2;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
        }
    }
}
