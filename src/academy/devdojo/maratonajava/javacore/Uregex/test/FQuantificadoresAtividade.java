package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <javadoc> Quero fazer uma atividade onde eu pego uma string com vários emails, e extraio apenas os emails
 * válidos</javadoc>
 */
public class FQuantificadoresAtividade {
    public static void main(String[] args) {

        String text = text();
        ArrayList<String> emails = emailsIdentify(text);

        System.out.println("Emails extraídos do texto: ");
        for (String email : emails) {
            System.out.println(email);
        }

    }

    public static ArrayList<String> emailsIdentify(String texto) {

        String regex = "\\s[\\w-_\\.]+@[a-z]+(\\.[a-z]+)+";
        String textToIdentify = Arrays.toString(texto.split("(^|,) "));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textToIdentify);

        ArrayList<String> emails = new ArrayList<String>();

        while (matcher.find()) {
            emails.add(matcher.group().trim());
        }

        return emails;
    }


    public static String text() {
        return """
                 john.doe@example.com, dsfsdafsdafsafasf, jane.smith@gmail.com, peter.parker@yahoo.com, emily.jones@hotmail.com, michael.brown@outlook.com, alice@company, bob@123@gmail.com, carol.smith@.net, david#example.com, emma@domain..com, samuel@domain, sdafjkhasdf hjkasdfhjkl, linda!hotmail.com, tom@123@yahoo..com, sophie@place_, george@website..org, anna@domain.com, max_123@outlook.com, kate.smith@gmail.com, jack_jones@yahoo.co.uk, sarah.miller@hotmail.co.jp, joe#example.com, emily@company, jacob@123@gmail.com, lisa.smith@.net, matt@domain..com, maria@domain, chris!hotmail.com, sophia@123@yahoo..com, daniel@place_, emily@website..org, ryan@gmail.com""";
    }
}

