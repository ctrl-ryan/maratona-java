package academy.devdojo.maratonajava.javacore.Rdataseformatacao.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ENumberFormat {
    public static void main(String[] args) {
        Locale localeDefaul = Locale.getDefault();
        Locale localeBR =  new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor  = 1_000.213;

        for(NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(3);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.213";
        try {
            System.out.println(nfa[0].parse(valorString));//NumberFormat.getInstance().parse(valorString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
