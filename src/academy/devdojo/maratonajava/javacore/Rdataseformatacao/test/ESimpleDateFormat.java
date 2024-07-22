package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ESimpleDateFormat {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' YYYY 'as' HH:mm:ss z";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

    }
}
