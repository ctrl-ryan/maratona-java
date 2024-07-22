package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        String string = "1, josé";

        Scanner scanner = new Scanner(string).useDelimiter(", ");


        while(scanner.hasNext()){
            if (scanner.hasNextInt()) { System.out.println("Idades: " + scanner.nextInt());}
            else scanner.next();
        }
    }

}

