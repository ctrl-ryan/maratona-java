package academy.devdojo.maratonajava.javacore.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle01 {
    public static void main(String[] args) {
//===========================================================================================
//ResourceBundle é uma classe do pacote java.util que facilita a internacionalização (i18n) de aplicações Java, permitindo que você carregue strings e outros recursos de maneira dependente da localização (locale). Isso é especialmente útil para aplicações que precisam ser traduzidas para diferentes idiomas ou adaptadas para diferentes regiões.

//A classe ResourceBundle é usada para carregar conjuntos de recursos localizados, como mensagens de interface do usuário, rótulos, mensagens de erro, etc. Você pode organizar esses recursos em arquivos de propriedades (.properties).

//Os arquivos de propriedades são o método mais comum para usar ResourceBundle. Eles são arquivos de texto simples com a extensão .properties e contêm pares de chave-valor. Você pode ter diferentes arquivos para diferentes idiomas, por exemplo:

/*
          messages_en.properties (para inglês)
          messages_pt_BR.properties (para português brasileiro)
          messages_fr.properties (para francês)         */


//------------------------------------------------------------------------------------------

    //Criando um local:

        Locale localeBR = new Locale("pt","BR");
        Locale localeEUA = new Locale("en", "US");

    //Criando um resource bundle com seu respectivo local:

        ResourceBundle bundleEUA = ResourceBundle.getBundle("messages", localeEUA);
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", localeBR);

    //Imprimindo as mensagens passando as suas chaves, que estão no arquivo texto messages_en_US.properties e messages_pt_BR.properties;

        System.out.println(bundleEUA.getString("hello"));//saída: Hello
        System.out.println(bundleEUA.getString("good.morning"));//saída: Good Morning

        System.out.println(bundleBR.getString("hello"));//saída: Olá
        System.out.println(bundleBR.getString("good.morning")); //saída: Bom dia!
    }
}
